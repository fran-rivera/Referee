package com.hk.notBeFooled.services;

import com.hk.notBeFooled.model.Appointment;
import com.hk.notBeFooled.model.CashOut;
import com.hk.notBeFooled.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class addMatchService {

    public static final String CATEGORY = "category.";
    @Autowired
    private final Category category;

    @Autowired
    private Environment environment;

    public addMatchService(Category category) {
        this.category = category;
    }


    public CashOut addMatch(Appointment appointment) {


        /**
         * 1. Register appointment in DB.
         * 2. Get CashOut : Get fees
         * 3. Register CashOut in DB.
         * 4. Return CashOut
         */

        CashOut co = new CashOut();
        co.setFees(getAmountFees(appointment));
        co.setExpense(getAmountExpense(getDistance(appointment)));
        co.setTravelExpenses(Double.valueOf(environment.getProperty(""+appointment.getSite())));


        return co;
    }

    private Double getAmountExpense(Double distance) {
    }


    public Double getAmountFees (Appointment appointment){
        return Double.valueOf(environment.getProperty(CATEGORY +appointment.getCompetition()));
    }


    public Double getDistance (Appointment appointment){
        // En funcion de la distancia obtenemos la dieta.
        return Double.valueOf(environment.getProperty("distance."+appointment.getCompetition()+"."+appointment.getSite()));
    }

    public Double getAmountFees (Appointment appointment){
        return Double.valueOf(environment.getProperty(CATEGORY +appointment.getCompetition()));
    }


}
