package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Add Java annotation, using the default bean id (Class name with first letter lowercase: tennisCoach
@Component
public class TennisCoach implements Coach {

	private SkillLevel currentSkill;
	
	// Configure dependency injection with Autowired annotation
	@Autowired
	public TennisCoach(SkillLevel currentSkill) {
		this.currentSkill = currentSkill;
	}

	public String getDailyWorkout() {
		return "Backhands, serving, and volleying is on today's menu!";
	}

	public String getSkillLevel() {
		return currentSkill.getSkillLevel();
	}

}
