package com.pucminas.verde;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VerdeApplication {
	
	@Bean
	public ModelMapper mapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(VerdeApplication.class, args);
	}

}
