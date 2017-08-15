package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WrestlingCoach implements Coach {

	private SkillLevel currentSkill;
	
	// variables for values.properties file injections
	@Value("${height}")
	private int heightInInches;
	@Value("${name}")
	private String name;
	
	// Set up a default constructor
	public WrestlingCoach(){
		System.out.println(">> WrestlingCoach: inside default constructor.");
	}
	
	// Create Setter injection for SkillLevel ********
	// @Autowire the SkillLevel dependency
	// @Qualifier specifies which SkillLevel interface implementation this class will use
	@Autowired
	@Qualifier("proSkillLevel")
	public void setSkillLevel(SkillLevel currentSkill){
		System.out.println(">> WrestlingCoach: inside @Autowired @Qualifier Setter setSkillLevel()");
		System.out.println("Name: " + name);
		System.out.println("Height: " + heightInInches + "\" ");
		this.currentSkill = currentSkill;
	}
	
	public String getDailyWorkout() {
		return "Today we'll be working on submissions and how to escape them.";
	}

	public String getSkillLevel() {
		System.out.println(">> WrestlingCoach: inside getSkillLevel()");
		return currentSkill.getSkillLevel();
	}

}
