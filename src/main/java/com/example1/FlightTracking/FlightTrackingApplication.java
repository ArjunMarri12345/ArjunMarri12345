package com.example1.FlightTracking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = " Flight Information System", title = "My API", version = "2.0.2"))
public class FlightTrackingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FlightTrackingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
