package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


// Add Spring java annotation with bean id
@Component("theCoach")
public class SoccerCoach implements Coach {

	private SkillLevel currentSkill;
	
	// Configure constructor dependency injection with Autowired annotation
	@Autowired
	public SoccerCoach(@Qualifier("currentSkillLevel")SkillLevel currentSkill) {
		System.out.println(">> SoccerCoach: inside @Autowired @Qualifier default constructor");
		this.currentSkill = currentSkill;
	}

	public String getDailyWorkout() {
		return "Penalty kicks and footwork is today's workout!";
	}

	public String getSkillLevel() {
		System.out.println(">> SoccerCoach: inside getSkillLevel()");
		return currentSkill.getSkillLevel();
	}

}
