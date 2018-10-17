package com.hk.notBeFooled.controllers;

import com.hk.notBeFooled.model.Appointment;
import com.hk.notBeFooled.model.CashOut;
import com.hk.notBeFooled.model.Referee;
import com.hk.notBeFooled.repository.RefereeRepository;
import com.hk.notBeFooled.services.addMatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class addMatchController {


    @Autowired
    private addMatchService addMatchService;

    @Autowired
    private RefereeRepository refereeRepository;


    @RequestMapping(method = RequestMethod.POST, value = "/notBeFooled/addMatch")
    public CashOut addMatch(@Valid @RequestBody Appointment appointment){
        Referee ref;
        try{
            ref = new Referee();
            ref.setName("Tomas");
            ref.setLastName1("Lopez");
            ref.setLastName2("Martin2");
            //ref.setBirthdate();
            ref.setCategory("1ª Div.Prov.Aficionados");
            ref.setDelegation("Zamora");
            ref.setEmail("tomaso@tom.com");

            refereeRepository.save(ref);

        }catch (Exception ex){
            System.out.println("Error al insertar");
        }

        return addMatchService.addMatch(appointment);
    }




}
