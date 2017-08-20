package com.gnguyen92.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes={ValuesConfig.class})
public class JavaConfigDemo {

	public static void main(String[] args) {
		
		//  load spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValuesConfig.class);
		
		// retreive the bean
		Coach myCoach = context.getBean("gymnasticsCoach", Coach.class);
		WrestlingCoach myCoach2 = context.getBean("wrestlingCoach", WrestlingCoach.class);
		
		// call methods on the bean
		System.out.println("\nGym: ");
		System.out.println(myCoach.getDailyWorkout());		
		
		// call method to get current skill level
		System.out.println(myCoach.getSkillLevel());
		
		System.out.println("\nWrestling: ");
		System.out.println(myCoach2.getDailyWorkout());
		System.out.println(myCoach2.getSkillLevel());
		
		// 	close the context
		context.close();
	}
}

/**************************** READ ME: INSTRUCTIONS  ***********************************/
/* ------ JAVA ANNOTATIONS CONFIGURATION -----------------------------
 * Spring scans the package for annotations without the use of any xml config files
 * 
 * 1)  Create a config java class (ValuesConfig)
 * 
 * 2)  Add @Configuration annotation to let Java know the class is a config file
 * 
 * 3)  Add @ComponentScan("package.name") to tell Java what package to scan
 * 
 * 4)  Create main app and load spring config with AnnotationConfigApplicationContext
 *  
 *  
 */
