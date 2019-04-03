package com.kshitij.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kshitij.service.SportsService;

@RestController
public class SportsController {
	@Autowired
	SportsService sportsService;
	
	
	@GetMapping("/createUser")
	public String getSportsDetails()
	{
		sportsService.createSports();
		return  "Sports Created";
	}

}
