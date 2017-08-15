package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach {

	private SkillLevel currentSkill;
	
	// Set up a default constructor
	public WrestlingCoach(){
		System.out.println(">> WrestlingCoach: inside default constructor.");
	}
	
	// Create setter method for SkillLevel
	// @Autowire the SkillLevel dependency
	@Autowired
	public void setSkillLevel(SkillLevel currentSkill){
		System.out.println(">> WrestlingCoach: inside @Autowired setSkillLevel()");
		this.currentSkill = currentSkill;
	}
	
	public String getDailyWorkout() {
		return "Today we'll be working on submissions and how to escape them.";
	}

	public String getSkillLevel() {
		return currentSkill.getSkillLevel();
	}

}
