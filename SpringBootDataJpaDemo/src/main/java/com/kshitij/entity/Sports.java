package com.kshitij.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sports {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sportsNo;
	private String sportsName;
	private int sportsLength;
	
	public Sports() {
		
		// TODO Auto-generated constructor stub
	}
	public Sports(String sportsName, int sportsLength) {
		
		this.sportsName = sportsName;
		this.sportsLength = sportsLength;
	}
	@Override
	public String toString() {
		return "Sports [sportsNo=" + sportsNo + ", sportsName=" + sportsName + ", sportsLength=" + sportsLength + "]";
	}
	

}
