package com.example.restfull.Api.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories ("com.example.restfull.Api.service")
@ComponentScan(basePackages = { "com.example.restfull.Api.service" })
@EntityScan("com.example.restfull.Api.service")   
public class WebApiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApiServiceApplication.class, args);
	}

}
