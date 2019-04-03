package com.kshitij.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemoController {
	
	@RequestMapping("/")
	public String  healthCheck() {
		return "Health Check";
	}
	
	@RequestMapping("/employee/get")
	public String getDetails() {
		return "Get Request";
	}
	
}
