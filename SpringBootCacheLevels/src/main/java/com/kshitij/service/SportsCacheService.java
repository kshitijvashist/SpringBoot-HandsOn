package com.kshitij.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.kshitij.beans.Sports;
import com.kshitij.exception.RecordNotFoundException;
import com.kshitij.interfaces.SportsRepository;
@Service
@Cacheable("sports")
public class SportsCacheService {
	private static final Logger logger=LoggerFactory.getLogger(SportsCacheService.class);
	@Autowired
	private SportsRepository repository;
	
	public List<Sports> getAllSportsService() {
		// TODO Auto-generated method stub
		List<Sports> list=new ArrayList<>();
		list=(List<Sports>)repository.findAll();
		if(list.size()<1)
			throw new RecordNotFoundException("No Sports present in the table Sports");
		logger.info("Size of the list after fetching all the records= "+list.size());
		return list;
		
	}
	@CachePut("sports")
	public Sports addSportsService(@Valid Sports sports) {
		// TODO Auto-generated method stub
		
		return repository.save(sports);
	}
	@Cacheable(value="sports",condition="#sportsId > 2")
	public Sports getSportsService(Long sportsId) {
		// TODO Auto-generated method stub
		
		Optional<Sports> sport=repository.findById(sportsId);
		
		if(!(sport.isPresent()))
			throw new RecordNotFoundException("Sports with sportsId="+sportsId+" is not found");
		
		return sport.get();
		
	}

}
