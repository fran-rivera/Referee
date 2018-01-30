package com.hk.notBeFooled.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Appointment {

    String id;
    @NotNull
    String competition;
    @NotNull
    String site;
    @NotNull
    @JsonFormat(pattern="dd-MM-yyyy")
    Date dateMatch;

    public Appointment() {
    }

    public Appointment(String id, String competition, String site, Date dateMatch) {
        this.id = id;
        this.competition = competition;
        this.site = site;
        this.dateMatch = dateMatch;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCategory(String category) {
        this.competition = category;
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
