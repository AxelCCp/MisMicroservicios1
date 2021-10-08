package com.serv.springboot.eureka.monkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootEurekaServermonkeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEurekaServermonkeyApplication.class, args);
	}

}
