package com.pl.dbObjects;

public class Genres {
    String MOV_TITLE;
    String GEN_TITLE;

    public Genres(String MOV_TITLE, String GEN_TITLE) {
        this.MOV_TITLE = MOV_TITLE;
        this.GEN_TITLE = GEN_TITLE;
    }

    public String getMOV_TITLE() {
        return MOV_TITLE;
    }

    public void setMOV_TITLE(String MOV_TITLE) {
        this.MOV_TITLE = MOV_TITLE;
    }

    public String getGEN_TITLE() {
        return GEN_TITLE;
    }

    public void setGEN_TITLE(String GEN_TITLE) {
        this.GEN_TITLE = GEN_TITLE;
    }
}
