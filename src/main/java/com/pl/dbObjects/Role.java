package com.pl.dbObjects;

public class Role {
    String MOV_TITLE;
    String ACT_FNAME;
    String ACT_LNAME;
    String ROLE;

    public Role(String MOV_TITLE, String ACT_FNAME, String ACT_LNAME, String ROLE) {
        this.MOV_TITLE = MOV_TITLE;
        this.ACT_FNAME = ACT_FNAME;
        this.ACT_LNAME = ACT_LNAME;
        this.ROLE = ROLE;
    }

    public String getMOV_TITLE() {
        return MOV_TITLE;
    }

    public void setMOV_TITLE(String MOV_TITLE) {
        this.MOV_TITLE = MOV_TITLE;
    }

    public String getACT_FNAME() {
        return ACT_FNAME;
    }

    public void setACT_FNAME(String ACT_FNAME) {
        this.ACT_FNAME = ACT_FNAME;
    }

    public String getACT_LNAME() {
        return ACT_LNAME;
    }

    public void setACT_LNAME(String ACT_LNAME) {
        this.ACT_LNAME = ACT_LNAME;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }
}
