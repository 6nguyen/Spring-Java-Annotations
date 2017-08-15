package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Add Spring java annotation with bean id
@Component("theCoach")
public class SoccerCoach implements Coach {

	private SkillLevel currentSkill;
	
	// Configure dependency injection with Autowired annotation
	@Autowired
	public SoccerCoach(SkillLevel currentSkill) {
		this.currentSkill = currentSkill;
	}

	public String getDailyWorkout() {
		return "Penalty kicks and footwork is today's workout!";
	}

	public String getSkillLevel() {
		return currentSkill.getSkillLevel();
	}

}
