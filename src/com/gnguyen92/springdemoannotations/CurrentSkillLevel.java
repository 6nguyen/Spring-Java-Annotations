package com.gnguyen92.springdemoannotations;

import org.springframework.stereotype.Component;

// Add default java annotation
@Component
public class CurrentSkillLevel implements SkillLevel {

	String[] skillLevels = {
			"God you're awful!  You should consider spending your time elsewhere...",
			"You're getting pretty good, at least intermediate level I'd say.",
			"Wow. You've improved so much! You're like a prodigy!"
	};
	
	public String getSkillLevel() {
		int randIndex = (int)Math.floor(Math.random() * skillLevels.length);
		
		return skillLevels[randIndex];
	}

}
