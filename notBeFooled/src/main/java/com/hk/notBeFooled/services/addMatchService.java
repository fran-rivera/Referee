package com.hk.notBeFooled.services;

import com.hk.notBeFooled.model.Appointment;
import com.hk.notBeFooled.model.CashOut;
import com.hk.notBeFooled.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class addMatchService {

    @Autowired
    private final Category category;

    public addMatchService(Category category) {
        this.category = category;
    }


    public CashOut addMatch(Appointment appointment) {


        /**
         * 1. Register appointment in DB.
         * 2. Get CashOut
         * 3. Register CashOut in DB.
         * 4. Return CashOut
         */


        // Recoger derechos en función de la categoría.
        appointment.getCategory();

        CashOut co = new CashOut();
        co.setFees(Double.valueOf(this.category.getTercera()));



        return co;
    }
}
