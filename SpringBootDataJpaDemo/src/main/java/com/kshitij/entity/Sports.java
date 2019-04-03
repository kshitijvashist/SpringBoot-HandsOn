package com.kshitij.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sports")
public class Sports {
	@Id
	private Long id;
	private String sportsName;
	private int sportsLength;
	
	public Sports() {
		
		// TODO Auto-generated constructor stub
	}

	public Sports(Long id, String sportsName, int sportsLength) {
		super();
		this.id = id;
		this.sportsName = sportsName;
		this.sportsLength = sportsLength;
	}

	@Override
	public String toString() {
		return "Sports [id=" + id + ", sportsName=" + sportsName + ", sportsLength=" + sportsLength + "]";
	}
	
	
}
