package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(value="com.example.main.*")
@SpringBootApplication
public class BookDetailsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookDetailsProjectApplication.class, args);
	}

}
