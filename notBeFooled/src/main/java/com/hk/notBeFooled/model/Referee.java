package com.hk.notBeFooled.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "REFEREE")
public class Referee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;
    @NotNull
    String name;
    @NotNull
    String lastName1;
    String lastName2;
    Date birthdate;
    @NotNull
    String email;
    @NotNull
    String category;
    @NotNull
    String delegation;


    public Referee(String id, String name, String lastName1, String lastName2, Date birthdate, String email, String category, String delegation) {
        this.id = id;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.birthdate = birthdate;
        this.email = email;
        this.category = category;
        this.delegation = delegation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDelegation() {
        return delegation;
    }

    public void setDelegation(String delegation) {
        this.delegation = delegation;
    }
}
