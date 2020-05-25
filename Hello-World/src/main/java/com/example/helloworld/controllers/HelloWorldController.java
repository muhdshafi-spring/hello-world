package com.example.helloworld.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.helloworld.services.HelloWorld;

@Controller
public class HelloWorldController {
	private HelloWorld helloWorld;

	@Autowired
	public HelloWorldController(HelloWorld helloWorld) {
		super();
		this.helloWorld = helloWorld;
	}

	public String getMessage() {
		return helloWorld.sayHello();
	}

}
