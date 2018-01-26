package com.hk.notBeFooled.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("category")
public class Category {

    private String tercera;

    private String ligaNacionalJuvenil;


    public String getTercera() {
        return tercera;
    }

    public void setTercera(String tercera) {
        this.tercera = tercera;
    }


    public String getLigaNacionalJuvenil() {
        return ligaNacionalJuvenil;
    }

    public void setLigaNacionalJuvenil(String ligaNacionalJuvenil) {
        this.ligaNacionalJuvenil = ligaNacionalJuvenil;
    }




}
