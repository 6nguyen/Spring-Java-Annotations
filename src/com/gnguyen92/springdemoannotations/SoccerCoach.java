package com.gnguyen92.springdemoannotations;

import org.springframework.stereotype.Component;


// Add Spring java annotation with bean id
@Component("theCoach")
public class SoccerCoach implements Coach {

	public String getDailyWorkout() {
		return "Penalty kicks and footwork is today's workout!";
	}

}
