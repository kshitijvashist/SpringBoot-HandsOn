package com.kshitij.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kshitij.dto.Sports;
import com.kshitij.service.SpringService;

@RestController
public class SpringController {
	private static final Logger logger =LoggerFactory.getLogger(SpringController.class);
	@Autowired
	private SpringService service;
	
	@GetMapping("/sports")
	public List<Sports> getAllSports()
	{
		
		return service.getAllSports();
		
	}
	
	@GetMapping("/sports/{sportsId}")
	public Sports getSports(@PathVariable Long sportsId)
	{
		logger.info("Fetch Data for SportsId="+sportsId);
		
		return service.getSports(sportsId);
		
	}
	
	@PostMapping("/sports/add")
	public Sports addSports(@Valid @RequestBody Sports sports)
	{
		return service.addSports(sports);
	}
}
