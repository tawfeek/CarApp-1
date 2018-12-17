package com.carsApp.MohamadCars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MohamadCarsApplication {

	private static final Logger logger = LoggerFactory.getLogger(MohamadCarsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MohamadCarsApplication.class, args);
		logger.info("Hello Spring Boot");

	}

}

