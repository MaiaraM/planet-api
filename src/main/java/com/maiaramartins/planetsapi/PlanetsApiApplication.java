package com.maiaramartins.planetsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.maiaramartins")
public class PlanetsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlanetsApiApplication.class, args);
	}

}
