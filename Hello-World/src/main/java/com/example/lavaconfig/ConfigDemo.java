package com.example.lavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDemo {
	@Bean
	Greet greet() {
		return new Greet();
	}
}
