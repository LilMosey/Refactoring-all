package com.refactor.chapter.one.entity.enums;

public enum PlayType {
    TRAGEDY("tragedy"),
    COMEDY("comedy");

    private String desc;

    PlayType(String desc){
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
