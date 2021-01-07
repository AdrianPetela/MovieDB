package com.pl.dbObjects;

public class topMovie {
    String MOV_TITLE;
    String rating;

    public topMovie(String MOV_TITLE, String rating) {
        this.MOV_TITLE = MOV_TITLE;
        this.rating = rating;
    }

    public String getMOV_TITLE() {
        return MOV_TITLE;
    }

    public void setMOV_TITLE(String MOV_TITLE) {
        this.MOV_TITLE = MOV_TITLE;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
