package com.example.brm_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BrmWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrmWebApplication.class, args);
		System.out.println("Brm Home");
	}

}
