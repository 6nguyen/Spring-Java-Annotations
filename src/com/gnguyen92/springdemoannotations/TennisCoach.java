package com.gnguyen92.springdemoannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// Add Java annotation, using the default bean id (Class name with first letter lowercase: tennisCoach
// Add java annotation for scope/lifecycle
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	// Field injection with @Autowired ********
	@Autowired
	@Qualifier("currentSkillLevel")
	private SkillLevel currentSkill;
	
	public TennisCoach( ) {
		System.out.println(">> TennisCoach: inside default constructor.");
	}
	

	public String getDailyWorkout() {
		return "Backhands, serving, and volleying is on today's menu!";
	}

	public String getSkillLevel() {
		System.out.println(">> TennisCoach: inside getSkillLevel()");
		return currentSkill.getSkillLevel();
	}

}
