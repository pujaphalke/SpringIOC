package com.springboot.myfirstSpringbootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstSpringbootapplicationApplication {

	public static void main(String[] args) {
		System.out.println("Pull from GitHub");
		SpringApplication.run(MyfirstSpringbootapplicationApplication.class, args);
	}

}
