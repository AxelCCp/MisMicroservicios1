package com.micro.springboot.app.donkey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SpringbootServicioDonkeyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioDonkeyApplication.class, args);
	}

}
