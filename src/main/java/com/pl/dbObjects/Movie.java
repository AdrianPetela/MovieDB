package com.pl.dbObjects;

public class Movie {
    int MOV_ID;
    String MOV_TITLE;
    int MOV_YEAR;
    int MOV_TIME;
    String MOV_LANG;
    String MOV_DT_REL;
    String MOV_REL_COUNTRY;

    public Movie(int MOV_ID,  String MOV_TITLE, int MOV_YEAR, int MOV_TIME, String MOV_LANG, String MOV_DT_REL, String MOV_REL_COUNTRY) {
        this.MOV_ID = MOV_ID;
        this.MOV_TITLE = MOV_TITLE;
        this.MOV_YEAR = MOV_YEAR;
        this.MOV_TIME = MOV_TIME;
        this.MOV_LANG = MOV_LANG;
        this.MOV_DT_REL = MOV_DT_REL;
        this.MOV_REL_COUNTRY = MOV_REL_COUNTRY;
    }

    public int getMOV_ID() {
        return MOV_ID;
    }

    public void setMOV_ID(int MOV_ID) {
        this.MOV_ID = MOV_ID;
    }

    public String getMOV_TITLE() {
        return MOV_TITLE;
    }

    public int getMOV_YEAR() {
        return MOV_YEAR;
    }

    public int getMOV_TIME() {
        return MOV_TIME;
    }

    public String getMOV_LANG() {
        return MOV_LANG;
    }

    public String getMOV_DT_REL() {
        return MOV_DT_REL;
    }

    public String getMOV_REL_COUNTRY() {
        return MOV_REL_COUNTRY;
    }

    public void setMOV_TITLE(String MOV_TITLE) {
        this.MOV_TITLE = MOV_TITLE;
    }

    public void setMOV_YEAR(int MOV_YEAR) {
        this.MOV_YEAR = MOV_YEAR;
    }

    public void setMOV_TIME(int MOV_TIME) {
        this.MOV_TIME = MOV_TIME;
    }

    public void setMOV_LANG(String MOV_LANG) {
        this.MOV_LANG = MOV_LANG;
    }

    public void setMOV_DT_REL(String MOV_DT_REL) {
        this.MOV_DT_REL = MOV_DT_REL;
    }

    public void setMOV_REL_COUNTRY(String MOV_REL_COUNTRY) {
        this.MOV_REL_COUNTRY = MOV_REL_COUNTRY;
    }

}
