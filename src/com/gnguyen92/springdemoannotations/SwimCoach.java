package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// add default component java annotation
@Component
public class SwimCoach implements Coach {

	// declare SkillLevel instance variable
	private SkillLevel currentSkill;
	
	// Configure dependency injection with Autowired annotation
	@Autowired
	public SwimCoach(SkillLevel currentSkill){
		this.currentSkill = currentSkill;
	}
	
	public String getDailyWorkout() {
		return "Breast stroke, backstroke, and 30 laps of freestyle.";
	}

	public String getSkillLevel() {
		return currentSkill.getSkillLevel();
	}

}
