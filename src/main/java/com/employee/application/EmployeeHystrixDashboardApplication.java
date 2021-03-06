package com.employee.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class EmployeeHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeHystrixDashboardApplication.class, args);
	}

}
