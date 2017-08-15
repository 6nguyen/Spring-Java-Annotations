package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// add default component java annotation
@Component
public class SwimCoach implements Coach {

	// declare SkillLevel instance variable
	private SkillLevel currentSkill;
	
	// Configure dependency injection with Autowired annotation **********
	// @Qualifier for constructor is added as an argument
	@Autowired
	public SwimCoach(@Qualifier("injuryStatus")SkillLevel currentSkill){
		System.out.println(">> SwimCoach: inside @Autowired @Qualifier default constructor.");
		this.currentSkill = currentSkill;
	}
	
	public String getDailyWorkout() {
		return "Breast stroke, backstroke, and 30 laps of freestyle.";
	}

	public String getSkillLevel() {
		System.out.println(">> SwimCoach: inside getSkillLevel()");
		return currentSkill.getSkillLevel();
	}

}
