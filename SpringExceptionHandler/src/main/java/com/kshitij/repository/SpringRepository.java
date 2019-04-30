package com.kshitij.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kshitij.dto.Sports;

@Repository
public interface SpringRepository extends CrudRepository<Sports,Long>{

}
