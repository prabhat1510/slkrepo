package com.training.helloworldservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelloworldServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloworldServiceApplication.class, args);
	}

}
