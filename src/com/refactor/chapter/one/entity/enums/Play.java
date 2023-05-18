package com.refactor.chapter.one.entity.enums;

public enum Play {

    HAMLET("Hamlet", PlayType.TRAGEDY),
    ASISLIKE("As you like it",PlayType.COMEDY),
    OTHELLO("Othello",PlayType.TRAGEDY);

    Play(String name, PlayType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public PlayType getType() {
        return type;
    }

    private String name;

    private PlayType type;

    public static Play getPlayerByPlayName(String playId){
        for (Play value : values()) {
            if(value.toString().equals(playId)){
                return value;
            }
        }
        return null;
    }


}
