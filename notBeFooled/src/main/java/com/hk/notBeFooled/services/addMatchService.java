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

        Double distance = getDistance(appointment);

        CashOut co = new CashOut();
        co.setFees(getAmountFees(appointment));

        if (distance == null) {

            System.out.println("No se puede calcular correctamente la liquidación! Distance is empty!" );

        }else{

            co.setExpense(getAmountExpense(distance));
            co.setTravelExpenses(getAmountExpenseTravel(distance));

        }

        co.setTotalAmount(co.getFees()+co.getExpense()+co.getTravelExpenses());

        return co;
    }

    private Double getAmountExpense(Double distance) {

        Double min = 50.0;
        Double medium = 100.0;

        if (distance <= min){
            return Double.valueOf(environment.getProperty("expenses.minium"));
        }else if (distance > min && distance <= medium){
            return Double.valueOf(environment.getProperty("expenses.medium"));
        }else {
            return Double.valueOf(environment.getProperty("expenses.maximum"));
        }

    }

    private Double getAmountExpenseTravel(Double distance) {
        return distance * 0.19;
    }

    public Double getAmountFees (Appointment appointment){
        return Double.valueOf(environment.getProperty(CATEGORY +appointment.getCompetition()));
    }

    public Double getDistance (Appointment appointment){
        // En funcion de la distancia obtenemos la dieta.
        return Double.valueOf(environment.getProperty("localTeam."+appointment.getCompetition()+"."+appointment.getSite()));
    }




}
