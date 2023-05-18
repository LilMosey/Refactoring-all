package com.refactor.chapter.one.resp;

import com.refactor.chapter.one.entity.Performance;
import com.refactor.chapter.one.entity.enums.Play;

public class PerformanceResp {

    private Integer amount;

    private Integer audience;

    private String playName;

    private Integer volumeCredit;

    public Integer getVolumeCredit() {
        return volumeCredit;
    }

    public void setVolumeCredit(Integer volumeCredit) {
        this.volumeCredit = volumeCredit;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAudience() {
        return audience;
    }

    public void setAudience(Integer audience) {
        this.audience = audience;
    }

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public static PerformanceResp of(Performance performance){
        PerformanceResp performanceResp = new PerformanceResp();
        performanceResp.setPlayName(Play.getPlayerByPlayName(performance.getPlayerId()).getName());
        performanceResp.setAudience(performance.getAudience());
        performanceResp.setAmount(performance.amountFor());
        performanceResp.setVolumeCredit(performance.volumeCredit());
        return performanceResp;
    }
}
