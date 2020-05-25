package com.example.helloworld.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({ "default", "EN" })
public class HelloWorldEnglish implements HelloWorld {

	@Override
	public String sayHello() {
		System.out.println("Hello World!!!");
		return "Hello World!!!";
	}
}
