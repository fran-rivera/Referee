package com.hk.notBeFooled.controllers;

import com.hk.notBeFooled.model.Appointment;
import com.hk.notBeFooled.model.CashOut;
import com.hk.notBeFooled.services.addMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class addMatchController {


    @Autowired
    addMatchService addMatchService;


    @RequestMapping("/addMatch")
    public CashOut addMatch(Appointment appointment){
        return addMatchService.addMatch(appointment);
    }

}
