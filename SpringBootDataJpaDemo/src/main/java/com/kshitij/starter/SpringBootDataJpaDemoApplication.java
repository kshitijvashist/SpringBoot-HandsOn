package com.kshitij.starter;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kshitij.entity.Sports;
import com.kshitij.interfaces.SportsRepository;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages= {"com.kshitij.controller","com.kshitij.service","com.kshitij.interfaces","com.kshitij.entity"})
public class SpringBootDataJpaDemoApplication {
	public static void main(String arguements[])
	{
		SpringApplication.run(SpringBootDataJpaDemoApplication.class, arguements);
	}

	
}
