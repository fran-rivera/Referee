package com.hk.notBeFooled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@SpringBootApplication //(exclude = SecurityAutoConfiguration.class)
public class NotBeFooledApplication {

	public static void main(String[] args) {

		SpringApplication.run(NotBeFooledApplication.class, args);
	}






}
