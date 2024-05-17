package com.app.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class WebcrudStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebcrudStudentApplication.class, args);
		System.out.println("Project Start .....!");
	}

}
