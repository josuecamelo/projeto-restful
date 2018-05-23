package com.jcamelosti.projetorestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.jcamelosti.model"})  // scan JPA entities
public class ProjetoRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoRestfulApplication.class, args);
	}
}
