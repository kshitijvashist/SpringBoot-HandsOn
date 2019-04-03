package com.kshitij.interfaces;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kshitij.entity.Sports;
@Repository
public interface SportsRepository extends CrudRepository<Sports, Long>{
	 List<Sports> findByName(String sportsName);

}
