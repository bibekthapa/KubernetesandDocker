package com.dcoker.deloy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DeloyApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot is starting");
		SpringApplication.run(DeloyApplication.class, args);
		
	}

}
