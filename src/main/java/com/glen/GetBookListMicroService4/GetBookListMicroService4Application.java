package com.glen.GetBookListMicroService4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GetBookListMicroService4Application {

	public static void main(String[] args) {
		SpringApplication.run(GetBookListMicroService4Application.class, args);
	}

}

