package com.hk.notBeFooled.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Appointment {

    String id;
    String category;
    String site;
    @JsonFormat(pattern="dd-MM-yyyy")
    Date dateMatch;

    public Appointment() {
    }

    public Appointment(String id, String category, String site, Date dateMatch) {
        this.id = id;
        this.category = category;
        this.site = site;
        this.dateMatch = dateMatch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }
}
