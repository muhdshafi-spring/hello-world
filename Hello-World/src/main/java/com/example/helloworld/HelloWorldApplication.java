package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.helloworld.controllers.HelloWorldController;
import com.example.lavaconfig.Greet;

@SpringBootApplication
@ComponentScan(basePackageClasses = Greet.class, basePackages = { "com.example.helloworld" })
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(HelloWorldApplication.class, args);
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		helloWorld.sayHello();

		// Profile Demo
		HelloWorldController helloWorldController = (HelloWorldController) ctx.getBean("helloWorldController");
		helloWorldController.getMessage();

		// Java Annotation/Component Scan demo
		Greet greet = (Greet) ctx.getBean("greet");
		greet.getMessage();
	}

}
