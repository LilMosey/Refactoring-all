package com.refactor.chapter.one.entity;

import java.util.List;

public class Invoice {

    private String customer;

    private List<Performance> performanceList;

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Performance> getPerformanceList() {
        return performanceList;
    }

    public void setPerformanceList(List<Performance> performanceList) {
        this.performanceList = performanceList;
    }
}
