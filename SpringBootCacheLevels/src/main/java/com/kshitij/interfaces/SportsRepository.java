package com.kshitij.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kshitij.beans.Sports;
@Repository
public interface SportsRepository extends CrudRepository<Sports, Long> {

}
