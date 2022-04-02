package com.example.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringBootWebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvcApplication.class, args);
	}

}
