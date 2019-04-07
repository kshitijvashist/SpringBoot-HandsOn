package com.kshitij.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kshitij.dto.Sports;

@RestController
public class SwaggerController {
	
	@GetMapping("/getSwagger")
	public String getString()
	{
		return "Rest Get is Running.";
	}
	
	@GetMapping("/getSwagger/{id}")
	public String getStringWithParam(@PathVariable int id)
	{
		return "Rest Get is Running.";
	}
	
	@PostMapping("/getSwagger/createSports")
	public Sports postString(@RequestBody Sports sport)
	{
		return sport;
	}
	
	@PutMapping("/getSwagger/editSports")
	public Sports putString(@RequestBody Sports sport)
	{
		return sport;
	}
	
	@DeleteMapping("/getSwagger/deleteSports")
	public int deleteString(@PathVariable int id)
	{
		return id;
	}
	

}
