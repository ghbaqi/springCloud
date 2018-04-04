package com.example.consumeribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsumeRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeRibbonApplication.class, args);
	}
}
