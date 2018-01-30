package com.hk.notBeFooled.controllers;

import com.hk.notBeFooled.model.Appointment;
import com.hk.notBeFooled.model.CashOut;
import com.hk.notBeFooled.services.addMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class addMatchController {


    @Autowired
    addMatchService addMatchService;


    @RequestMapping(method = RequestMethod.POST, value = "/notBeFooled/addMatch")
    public CashOut addMatch(@Valid @RequestBody Appointment appointment){
        return addMatchService.addMatch(appointment);
    }

}
