package com.highfive.ela_prac;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ElaPracApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElaPracApplication.class, args);
	}

	@Bean
	public ModelMapper getMapper() {

		return new ModelMapper();
	}

}
