package com.kshitij.service;

import java.util.ArrayList;
import java.util.List;

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
		sportsRepository.save(new Sports(1l,"Football",12));
		sportsRepository.save(new Sports(2l,"Cricket",11));
		sportsRepository.save(new Sports(3l,"BasketBall",7));
		
	List<Sports> list=new ArrayList<>();
	list=(List<Sports>) sportsRepository.findAll();
	System.out.println(list.size());
		
		
		
		
		
	}

}
