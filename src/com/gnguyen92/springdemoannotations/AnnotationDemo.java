package com.gnguyen92.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		//  load spring xml config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retreive the bean
		Coach myCoach = context.getBean("wrestlingCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		
		// call method to get current skill level
		System.out.println(myCoach.getSkillLevel());
		
		// 	close the context
		context.close();
	}
}

/**************************** READ ME: INSTRUCTIONS  ***********************************/
/* ------ @Autowired Constructor Injection -----------------------------
 * 
 * 1)  Add Spring and Apache commons .jar files to src/lib
 * 
 * 2)  Project -> Properties -> Java Build Path -> Libraries -> Add JARs
 * 
 * 3)  Create applicationContext.xml -> Add entry for component-scanning
 * 
 * 4)  Create Coach interface with abstract getDailyWorkout()
 * 
 * 5)  Create some sports coach class to implement Coach methods -> @Component class instantiation
 * 
 * 6)  Create main class to test getDailyWorkout()
 * 
 * 7)  Create SkillLevel interface with abstract getSkillLevel()
 * 
 * 8)  Create CurrentSkillLevel to implemnt SkillLevel -> @Component class instantiation
 * 		-> write method to return a String/something
 * 
 * 9)  in SwimCoach -> Declare SkillLevel instance variable 
 * 		-> Create @Autowired constructor using SkillLevel object -> implement getSkillLevel()
 * 
 * 
 *  ---------- @Autowired Setter Injection ---------------------
 *  1)  Create new sports Coach class -> instantiate SkillLevel instance -> create default constructor 
 *  		-> implement inherited methods 
 *  
 *  2)  Create setter method in sports Coach for SkillLevel with @Autowired annotation
 *  
 *  3)  in AnnotationDemo -> in bean retrieval -> change bean id to new sports Coach class -> run
 */
