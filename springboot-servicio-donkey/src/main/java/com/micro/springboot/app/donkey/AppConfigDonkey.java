package com.micro.springboot.app.donkey;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfigDonkey {
	
	@Bean(name="clienteRest")
	public RestTemplate registroDeRestTemplate() {
		return new RestTemplate();
	}
}
