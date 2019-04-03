package com.kshitij.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.kshitij.controller")
public class SprintBootSl4jLoggerDemoApplication {
	public static void main(String arguements[]) {
		SpringApplication.run(SprintBootSl4jLoggerDemoApplication.class, arguements);
	}

}
