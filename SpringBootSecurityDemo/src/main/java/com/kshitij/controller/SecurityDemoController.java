package com.kshitij.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Configuration
@EnableWebSecurity
@RestController

public class SecurityDemoController {
	
	@RequestMapping("/")
	public String  healthCheck()
	{
		return "Health Check";
	}
	
	
	
	@RequestMapping("/employee/get")
	public String getDetails() {
		
		return "Get Request";
	}
	
	

	

}
