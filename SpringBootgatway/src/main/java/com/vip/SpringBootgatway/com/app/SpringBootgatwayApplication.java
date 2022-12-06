package com.vip.SpringBootgatway.com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringBootgatwayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootgatwayApplication.class, args);
	}

}
