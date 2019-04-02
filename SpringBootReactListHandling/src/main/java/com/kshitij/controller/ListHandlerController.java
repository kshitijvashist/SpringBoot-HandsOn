package com.kshitij.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kshitij.dto.Sports;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ListHandlerController {
	
	@PostMapping("/getList")
	public void getListOfSoprts(@RequestBody List<Sports> sportsList)
	{
		for(Sports getValues:sportsList)
		{
			System.out.println(getValues.getSportsNo());
			System.out.println(getValues.getSportsName());
			System.out.println(getValues.getSportslength());
		}
	}

}
