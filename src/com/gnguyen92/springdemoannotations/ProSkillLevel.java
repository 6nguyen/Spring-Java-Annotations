package com.gnguyen92.springdemoannotations;

import org.springframework.stereotype.Component;

@Component
public class ProSkillLevel implements SkillLevel {

	public String getSkillLevel() {
		return "Holy cow...you're a pro!  Let me call my scouter.";
	}

}
