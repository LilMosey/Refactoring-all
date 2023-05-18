package com.refactor.chapter.one.entity;

public class ComedyPerformance extends Performance {
    public ComedyPerformance(String playerId, Integer audience) {
        super(playerId, audience);
    }

    @Override
    public Integer amountFor() {
        Integer result = 30000;

        if (this.getAudience() > 20) {
            result += 10000 + 500 * (this.getAudience() - 20);
        }
        result += 300 * this.getAudience();

        return result / 100;
    }

    @Override
    public int volumeCredit() {
        int result = super.volumeCredit();
        result += Math.floor(this.getAudience() / 5);
        return result;
    }
}
