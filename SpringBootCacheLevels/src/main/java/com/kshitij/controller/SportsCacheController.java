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

import com.kshitij.beans.Sports;
import com.kshitij.service.SportsCacheService;

@RestController
public class SportsCacheController {
	
	private static final Logger logger=LoggerFactory.getLogger(SportsCacheController.class);
	@Autowired
	private SportsCacheService service;
	
	@GetMapping("/sports")
	public List<Sports> getAllSportsList()
	{
		logger.info("Method to fetch all the records from table sports.");
		return service.getAllSportsService();
	}
	
	
	@PostMapping("/sports/add")
	public Sports addSports(@Valid @RequestBody Sports sports)
	{
		logger.info("Method to insert input sports data into table sports.");
		return service.addSportsService(sports);
	}
	
	
	@GetMapping("/sports/{sportsId}")
	public Sports getSportsList(@PathVariable Long sportsId)
	{
		logger.info("Method to fetch sports data on sportsId basis from table sports.");
		return service.getSportsService(sportsId);
	}

}
