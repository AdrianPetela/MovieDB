package com.pl.dbObjects;

public class Director {
    String MOV_TITLE;
    String DIRECTOR;

    public Director(String MOV_TITLE, String DIRECTOR) {
        this.MOV_TITLE = MOV_TITLE;
        this.DIRECTOR = DIRECTOR;
    }

    public String getMOV_TITLE() {
        return MOV_TITLE;
    }

    public void setMOV_TITLE(String MOV_TITLE) {
        this.MOV_TITLE = MOV_TITLE;
    }

    public String getDIRECTOR() {
        return DIRECTOR;
    }

    public void setDIRECTOR(String DIRECTOR) {
        this.DIRECTOR = DIRECTOR;
    }
}
