package com.kshitij.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/call")
public class LoggerController {
	
	private static final Logger logger =LoggerFactory.getLogger(LoggerController.class);
	@RequestMapping("/logger")
	public String getLogger()
	{
		logger.info("This is logger initiater method");
		logger.info("The return statement is=Logger works succesfully.");
		logger.info("For Configuration related to saving logger in file.. See the application.properties file.");
		return "Logger works succesfully.";
	}

}
