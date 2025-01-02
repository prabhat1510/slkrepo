package com.training.bookrestapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class BookrestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookrestapiApplication.class, args);
	}

	@Value("${app.title}")
	private String title;
	
	@Value("${app.license}")
	private String license;
	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String appDesciption,
			@Value("${application-version}") String appVersion) {
		
		
		return new OpenAPI().info(new Info().title(title).version(appVersion)
				.description(appDesciption).termsOfService("http://swagger.io/terms/")
				.license(new License().name(license).url("http://springdoc.org")));
	}
}
