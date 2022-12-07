package com.example.tutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class TutorialApplication {

//	private static final Logger log = LoggerFactory.getLogger(TutorialApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TutorialApplication.class, args);
	}

	// RestTemplate을 이용해 다른 REST API로부터 간단한 JSON 데이터를 받아오는 코드.
//	@Bean
//	public RestTemplate restTemplate(RestTemplateBuilder builder) {
//		return builder.build();
//	}
//
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			Quote quote = restTemplate.getForObject(
//					"http://localhost:8080/api/random", Quote.class);
//			log.info(quote.toString());
//		};
//	}

}
