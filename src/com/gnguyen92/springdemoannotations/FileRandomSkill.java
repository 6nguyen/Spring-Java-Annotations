package com.gnguyen92.springdemoannotations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FileRandomSkill implements SkillLevel {

	private String filepath = "C:/Users/gnguy/Desktop/Java/spring-demo-annotations/src/skillLevel.properties";
	private List<String> skillLevels;
	
	// create default constructor to read file and store values into array
	public FileRandomSkill() throws IOException {
		File file = new File(filepath);
		
		System.out.println(">> Reading from file " + filepath);
		System.out.println(">> File exists: " + file.exists());
		
		// initialize the array
		skillLevels = new ArrayList<String>();
		
		// read from the file
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(file));
			
			// Add each line into skillLevels[]
			String temp;
			while((temp = br.readLine()) != null) {
				skillLevels.add(temp);
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// ArrayList length method:  arrayList.size()
	// ArrayList element at index: arrayList.get(i)
	public String getSkillLevel() {
		int randomIndex = (int)Math.floor(Math.random() * skillLevels.size());
		return skillLevels.get(randomIndex);
	}

}
