package com.hk.notBeFooled.services;

import com.hk.notBeFooled.model.Appointment;
import com.hk.notBeFooled.model.CashOut;
import com.hk.notBeFooled.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class addMatchService {

    @Autowired
    Category category;

    public CashOut addMatch(Appointment appointment) {


        CashOut co = new CashOut();
        co.setFees(category.getTercera());


        return co;
    }
}
