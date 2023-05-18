package com.refactor.chapter.one.entity;

import com.refactor.chapter.one.entity.enums.Play;
import com.refactor.chapter.one.entity.enums.PlayType;

public abstract class Performance {
    private String playerId;

    private Integer audience;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Integer getAudience() {
        return audience;
    }

    public void setAudience(Integer audience) {
        this.audience = audience;
    }

    public abstract Integer amountFor();

    public int volumeCredit(){
        int result =  Math.max(this.getAudience() - 30, 0);
        return result;
    }

    public static Performance buildPerformance(String playerId,Integer audience){
        PlayType type = Play.getPlayerByPlayName(playerId).getType();
        if(type == PlayType.TRAGEDY){
            return new TragedyPerformance(playerId,audience);
        }else if (type == PlayType.COMEDY){
            return new ComedyPerformance(playerId,audience);
        }
        return null;
    }

    public Performance(String playerId, Integer audience) {
        this.playerId = playerId;
        this.audience = audience;
    }
}
