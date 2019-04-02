package com.kshitij.mainClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.kshitij.controller")
public class SpringBootReactListHandlingApplication {
	public static void main(String args[])
	{
		SpringApplication.run(SpringBootReactListHandlingApplication.class, args);
	}

}
