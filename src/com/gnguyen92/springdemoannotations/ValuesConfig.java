/* 
 *  @Configuration java class for Spring java configuration (no xml)
 *  @Bean class and method definitions
 * 
 * 
 * */

package com.gnguyen92.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Add @Configuration annotation to tell Java this is a config file
// Add @ComponentScan("package to scan")
@Configuration
@ComponentScan("com.gnguyen92.springdemoannotations")
public class ValuesConfig {
	
	// @Bean method definition ******************************
	@Bean
	public SkillLevel currentSkillLevel() {
		return new CurrentSkillLevel();
	}
	
	// @Bean class definition *******************************
	@Bean
	public Coach gymnasticsCoach(){
		return new GymnasticsCoach(currentSkillLevel());
	}
	
//	@Bean
//	public Coach GymnasticsCoach(SkillLevel skillLevel) {
//		GymnasticsCoach myGymCoach = new GymnasticsCoach(currentSkillLevel());
//		return myGymCoach;
//	}
	
	// @Bean class definition *********************************
	@Bean
	public WrestlingCoach wrestlingCoach(){
		return new WrestlingCoach();
	}
}
