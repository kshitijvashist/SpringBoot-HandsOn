package com.kshitij.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration
@Configuration
@SpringBootApplication(scanBasePackages= {"com.kshitij.controller","com.kshitij.service","com.kshitij.interfaces","com.kshitij.entity"})
public class SpringBootDataJpaDemoApplication {
	public static void main(String arguements[])
	{
		SpringApplication.run(SpringBootDataJpaDemoApplication.class, arguements);
	}

	
}
