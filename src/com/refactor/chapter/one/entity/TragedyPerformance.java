package com.refactor.chapter.one.entity;

public class TragedyPerformance extends Performance {
    @Override
    public Integer amountFor() {

        Integer result = 40000;
        if (this.getAudience() > 30) {
            result += 1000 * (this.getAudience() - 30);
        }
        return result / 100;
    }

    public TragedyPerformance(String playerId, Integer audience) {
        super(playerId, audience);
    }
}
