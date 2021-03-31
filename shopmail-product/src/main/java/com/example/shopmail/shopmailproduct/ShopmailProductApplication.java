package com.example.shopmail.shopmailproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.example.shopmail.shopmailproduct.dao")
@SpringBootApplication
public class ShopmailProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopmailProductApplication.class, args);
	}

}
