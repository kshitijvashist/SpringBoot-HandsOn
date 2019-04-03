package com.kshitij.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshitij.entity.Sports;
import com.kshitij.interfaces.SportsRepository;
@Service
public class SportsService {
	
	@Autowired 
	private SportsRepository sportsRepository;
	
	public void createSports()
	{
		sportsRepository.save(new Sports("Football",12));
		sportsRepository.save(new Sports("Cricket",11));
		sportsRepository.save(new Sports("BasketBall",7));
		System.out.println(sportsRepository.count());
		System.out.println(sportsRepository.findByName("Football"));
		
		
	}

}
