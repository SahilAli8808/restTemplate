package com.esd.develop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RestExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestExampleApplication.class, args);
	}

	@Bean
	public WebClient.Builder getWebClientBuilder() {
		return  WebClient.builder();
	}
	
	@Bean
	public RestTemplate  getRestTemplate() {
		return  new RestTemplate();
	}
}
