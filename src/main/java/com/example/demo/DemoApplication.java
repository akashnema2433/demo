package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
	@PostConstruct
	public void runImage(){
		System.out.println("testing done...");
		System.out.println("test1....");
		System.out.println("test2....");
	}

	public static void main(String[] args) {
		System.out.println("hello...");
		SpringApplication.run(DemoApplication.class, args);
	}

}
