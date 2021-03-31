package com.example.shopmail.shopmailmember;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.example.shopmail.shopmailmember.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class ShopmailMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopmailMemberApplication.class, args);
	}

}
