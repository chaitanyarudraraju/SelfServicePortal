package com.selfserviceportal.AdminService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdminService {

	public static void main(String[] args) {
		SpringApplication.run(AdminService.class, args);
	}

}
