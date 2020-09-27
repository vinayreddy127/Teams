package com.example.reccardapp;

public class Model
{
    private String teamName;
    private String short_name;
    private int imgname;
    private String teamDescription;
    private String teamMembers;




    public String getTeam_Name() {
        return teamName;
    }

    public void setTeam_Name(String teamName) {
        this.teamName = teamName;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getTeam_Description() {
        return teamDescription;
    }

    public void setTeam_Description(String teamDescription) { this.teamDescription = teamDescription; }

    public String getTeam_Members() {
        return teamMembers;
    }

    public void setTeam_Members(String teamMembers) {
        this.teamMembers = teamMembers;
    }

    public int getImgname() {
        return imgname;
    }

    public void setImgname(int imgname) {
        this.imgname = imgname;
    }


}
