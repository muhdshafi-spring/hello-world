package com.example.helloworld.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("FR")
public class HelloWolrdFrench implements HelloWorld {

	@Override
	public String sayHello() {
		System.out.println("Bonjour le monde !!!");
		return "Bonjour le monde !!!";
	}

}
