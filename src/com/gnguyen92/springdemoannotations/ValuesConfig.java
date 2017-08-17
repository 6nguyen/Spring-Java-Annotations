package com.gnguyen92.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Add @Configuration annotation to tell Java this is a config file
// Add @ComponentScan("package to scan")
//@Configuration
@ComponentScan("com.gnguyen92.springdemoannotations")
public class ValuesConfig {
	
	@Bean
	public SkillLevel currentSkillLevel() {
		return new CurrentSkillLevel();
	}
	
	@Bean
	public Coach swimCoach(SkillLevel skillLevel) {
		SwimCoach mySwimCoach = new SwimCoach(currentSkillLevel());
		return mySwimCoach;
	}
	
	@Bean
	public WrestlingCoach wrestlingCoach(){
		return new WrestlingCoach();
	}
}
