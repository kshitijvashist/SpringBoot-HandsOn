package com.kshitij.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="sports")
public class Sports {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long sportsId;
	@NotEmpty(message = "Sports Name must not be empty")
	private String sportsName;
	@NotEmpty(message = "Sports Type must not be empty")
	private String sportsType;
	public Long getSportsId() {
		return sportsId;
	}
	
	
public Sports() {
		super();
	}


//	  "status": 500,
//		"error": "Internal Server Error",
//		"message": "No default constructor for entity: : com.kshitij.dto.Sports; nested exception is org.hibernate.InstantiationException: No default constructor for entity: : com.kshitij.dto.Sports",
//		"path": "/sports/1"
		
	
	public void setSportsId(Long sportsId) {
		this.sportsId = sportsId;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getSportsType() {
		return sportsType;
	}
	public Sports(Long sportsId, String sportsName, String sportsType) {
		super();
		this.sportsId = sportsId;
		this.sportsName = sportsName;
		this.sportsType = sportsType;
	}
	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}
	
	

}
