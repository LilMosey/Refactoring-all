package com.refactor.chapter.one;

import com.refactor.chapter.one.entity.Invoice;
import com.refactor.chapter.one.entity.Performance;
import com.refactor.chapter.one.resp.PerformanceResp;
import com.refactor.chapter.one.resp.StatementDataResp;

import java.util.ArrayList;
import java.util.List;

public class ChapterOneDemoMain {

    private static final String RESULT = "Statement for Bigco\n" +
            "Hamlet:650    55 seats\n" +
            "As you like it:580    35 seats\n" +
            "Othello:500    40 seats\n" +
            "Amount owed is  1730\n" +
            "You earned 47credit";

    /**
     * {
     * "hamlet": {"name": "Hamlet", "type": "tragedy"},
     * "as-like": {"name": "As You Like It", "type": "comedy"},
     * "othello": {"name": "Othello", "type": "tragedy"}
     *
     * @param args
     */
    public static void main(String[] args) {
        String statement = statement(buildInvoice());
        System.out.println(statement);
        System.out.println(statement.equals(RESULT));
    }


    private static Invoice buildInvoice() {
        Invoice invoice = new Invoice();
        invoice.setCustomer("Bigco");

        Performance hamlet = Performance.buildPerformance("HAMLET",55);

        Performance asIsLike = Performance.buildPerformance("ASISLIKE",35);

        Performance othello = Performance.buildPerformance("OTHELLO",40);
        List<Performance> performanceList = new ArrayList<>();
        performanceList.add(hamlet);
        performanceList.add(asIsLike);
        performanceList.add(othello);
        invoice.setPerformanceList(performanceList);
        return invoice;
    }


    public static String statement(Invoice invoice){
        return renderPlainText(invoice).toString();
    }

    public static StatementDataResp renderPlainText(Invoice invoice) {

        StatementDataResp statement = new StatementDataResp();
        statement.setCustomer(invoice.getCustomer());

        List<PerformanceResp> performanceRespList = new ArrayList<>();
        invoice.getPerformanceList().forEach(performance -> {
            PerformanceResp performanceResp = PerformanceResp.of(performance);
            performanceRespList.add(performanceResp);
        });

        statement.setPerformanceRespList(performanceRespList);
        return statement;


    }





}
