package com.example.Demo_web_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
//@EnableMongoRepositories(basePackages = "com.example.Demo_web_api.repository")
public class DemoWebApiApplication {

	public static void main(String[] args) {
		System.out.println("Hello Worlds");
		SpringApplication.run(DemoWebApiApplication.class, args);
	}

}
