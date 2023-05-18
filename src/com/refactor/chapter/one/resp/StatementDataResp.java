package com.refactor.chapter.one.resp;

import java.util.List;

public class StatementDataResp {
    private String customer;


    private List<PerformanceResp> performanceRespList;

    public Integer getTotalAmount() {
        return performanceRespList.stream().map(p->p.getAmount()).reduce(0,Integer::sum);
    }


    public Integer getVolumeCredits() {
        return performanceRespList.stream().map(p->p.getVolumeCredit()).reduce(0,Integer::sum);
    }



    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<PerformanceResp> getPerformanceRespList() {
        return performanceRespList;
    }

    public void setPerformanceRespList(List<PerformanceResp> performanceRespList) {
        this.performanceRespList = performanceRespList;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Statement for " + customer + "\n");
        for (PerformanceResp performanceResp : performanceRespList) {
            result.append(performanceResp.getPlayName() + ":")
                    .append(performanceResp.getAmount() + "    ").
                    append(performanceResp.getAudience() + " seats\n");
        }
        result.append("Amount owed is  " + getTotalAmount() + "\n");
        result.append("You earned " + getVolumeCredits() + "credit");
        return result.toString();
    }
}
