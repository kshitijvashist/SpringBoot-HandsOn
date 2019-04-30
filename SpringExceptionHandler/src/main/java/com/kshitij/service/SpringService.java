package com.kshitij.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kshitij.dto.Sports;
import com.kshitij.exception.RecordNotFoundException;
import com.kshitij.repository.SpringRepository;
@Service
public class SpringService {
	@Autowired
	private SpringRepository repo;
	
	public List<Sports> getAllSports()
	{
		
		List<Sports> list=new ArrayList<>();
		list=(List<Sports>) repo.findAll();
		
		if(list.size()<1)
			throw new RecordNotFoundException("No Sports present");
		return list;
	}

	public Sports addSports(Sports sports) {
		// TODO Auto-generated method stub
		System.out.println(sports.getSportsName());
		repo.save(sports);
		return sports;
	}

	public Sports getSports(Long sportsId) {
		// TODO Auto-generated method stub
		Optional<Sports> sport=repo.findById(sportsId);
		
		if((!(sport.isPresent())))
			throw new RecordNotFoundException("Sports with id="+sportsId+" Not Found");
		
		return sport.get();
	}

}
