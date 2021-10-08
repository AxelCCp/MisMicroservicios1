package com.micro.springboot.app.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootServicioBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioBaseApplication.class, args);
	}

}
