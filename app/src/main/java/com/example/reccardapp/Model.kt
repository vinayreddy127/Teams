package com.example.reccardapp;

public class Model
{
    private String teamName;
    private String shortName;
    private int imgName;
    private String teamDescription;
    private String teamMembers;




    public String getTeam_Name() {
        return teamName;
    }

    public void setTeam_Name(String teamName) {
        this.teamName = teamName;
    }

    public String getShort_Name() {
        return shortName;
    }

    public void setShort_Name(String shortName) {
        this.shortName = shortName;
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

    public int getImg_Name() {
        return imgName;
    }

    public void setImg_Name(int imgName) {
        this.imgName = imgName;
    }


}
