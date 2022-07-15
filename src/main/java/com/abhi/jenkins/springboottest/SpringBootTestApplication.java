package com.abhi.jenkins.springboottest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootTestApplication{

	private final static Logger LOGGER = LoggerFactory.getLogger(SpringBootTestApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}
	
	@GetMapping("/")
	private String welcome() {
		LOGGER.info("\n\n\n\nWelcome to Spring Github jenkins Docker App !!! \n\n");
		return "Welcome to Spring Github jenkins Docker App !!! ";
	}

}
