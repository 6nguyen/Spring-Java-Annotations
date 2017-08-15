package com.gnguyen92.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class InjuryStatus implements SkillLevel {

	public String getSkillLevel() {
		return "Uh oh, looks like you're injured.  Go home, you can't practice today.";
	}

}
