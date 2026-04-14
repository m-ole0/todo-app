package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApiApplication {

	public static void main(String[] args) {
		System.out.println("起動確認");
		SpringApplication.run(TodoAppApiApplication.class, args);
	}

}
