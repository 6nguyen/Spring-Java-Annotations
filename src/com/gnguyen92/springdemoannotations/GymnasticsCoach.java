/* 
 *  @Bean ValuesConfig.java demonstration
 * 
 * */

package com.gnguyen92.springdemoannotations;

public class GymnasticsCoach implements Coach {

	private SkillLevel currentSkill;
	
	// default constructor for @Bean annotation in ValuesConfig.java
	public GymnasticsCoach(SkillLevel currentSkill){
		this.currentSkill = currentSkill;
	}
	
	public String getDailyWorkout() {
		return "I want to see clean backflips today followed by an hour of tumbling!";
	}

	public String getSkillLevel() {
		return currentSkill.getSkillLevel();
	}

}
