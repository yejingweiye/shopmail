package com.example.shopmail.shopmailthirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ShopmailThirdPartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopmailThirdPartyApplication.class, args);
	}

}
