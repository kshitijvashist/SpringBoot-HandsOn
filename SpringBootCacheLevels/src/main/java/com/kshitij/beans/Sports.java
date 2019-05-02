package com.kshitij.beans;

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
	
	@NotEmpty(message="Sports Name cannot be empty")
	private String sportsName;
	@NotEmpty(message="Sports Type cannot be empty")
	private String sportsType;
	public Sports(Long sportsId, String sportsName, String sportsType) {
		super();
		this.sportsId = sportsId;
		this.sportsName = sportsName;
		this.sportsType = sportsType;
	}
	public Long getSportsId() {
		return sportsId;
	}
	public void setSportsId(Long sportsId) {
		this.sportsId = sportsId;
	}
	public String getSportsName() {
		return sportsName;
	}
	public Sports() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public String getSportsType() {
		return sportsType;
	}
	public void setSportsType(String sportsType) {
		this.sportsType = sportsType;
	}
	
	

}
