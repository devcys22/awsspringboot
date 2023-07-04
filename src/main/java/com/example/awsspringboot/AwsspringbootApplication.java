package com.example.awsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class AwsspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsspringbootApplication.class, args);
	}

}
