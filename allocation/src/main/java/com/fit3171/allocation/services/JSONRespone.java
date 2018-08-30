package com.fit3171.allocation.services;

import java.util.ArrayList;

public class JSONRespone {
    private String supervisorname;
    private String title;
    private int creditPoints;
    private String background;
    private String aims;
    private ArrayList<String> prereq;
    private ArrayList<String> coreq;
    private String url;
    private ArrayList<String> category;
    private String campus;
    private String message;

    public JSONRespone(String supervisorname, String title, int creditPoints, String background, String aims, ArrayList<String> prereq, ArrayList<String> coreq, String url, ArrayList<String> category, String campus, String message) {
        this.supervisorname = supervisorname;
        this.title = title;
        this.creditPoints = creditPoints;
        this.background = background;
        this.aims = aims;
        this.prereq = prereq;
        this.coreq = coreq;
        this.url = url;
        this.category = category;
        this.campus = campus;
        this.message = message;
    }

    public String getSupervisorname() {
        return supervisorname;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public String getBackground() {
        return background;
    }

    public String getAims() {
        return aims;
    }

    public ArrayList<String> getPrereq() {
        return prereq;
    }

    public ArrayList<String> getCoreq() {
        return coreq;
    }

    public String getUrl() {
        return url;
    }

    public ArrayList<String> getCategory() {
        return category;
    }

    public String getCampus() {
        return campus;
    }

    public String getMessage() {
        return message;
    }
}
