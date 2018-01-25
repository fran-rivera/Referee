package com.hk.notBeFooled.model;

public class CashOut {

    String idReferee;
    String idAppointment;
    Double totalAmount;
    Double fees;
    Double expense;
    Double travelExpenses;



    public CashOut(String idReferee, String idAppointment, Double totalAmount, Double fees, Double expense, Double travelExpenses) {
        this.idReferee = idReferee;
        this.idAppointment = idAppointment;
        this.totalAmount = totalAmount;
        this.fees = fees;
        this.expense = expense;
        this.travelExpenses = travelExpenses;
    }

    public CashOut() {

    }

    public String getIdReferee() {
        return idReferee;
    }

    public void setIdReferee(String idReferee) {
        this.idReferee = idReferee;
    }

    public String getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(String idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Double getExpense() {
        return expense;
    }

    public void setExpense(Double expense) {
        this.expense = expense;
    }

    public Double getTravelExpenses() {
        return travelExpenses;
    }

    public void setTravelExpenses(Double travelExpenses) {
        this.travelExpenses = travelExpenses;
    }
}
