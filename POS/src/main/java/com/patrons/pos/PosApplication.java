package com.patrons.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PosApplication {

	public static void main(String[] args) {
		System.out.println("Wel come to pOS");
		SpringApplication.run(PosApplication.class, args);
	}

}
