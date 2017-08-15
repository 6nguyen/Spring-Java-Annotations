package com.gnguyen92.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		//  load spring xml config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retreive the bean
		Coach myCoach = context.getBean("swimCoach", Coach.class);
		Coach myCoach2 = context.getBean("wrestlingCoach", Coach.class);
		
		// call methods on the bean
		System.out.println("\nSwim: ");
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
 *  
 *  1)  Create WrestlingCoach class -> instantiate SkillLevel instance -> create default constructor 
 *  		-> implement inherited methods 
 *  
 *  2)  Create setter method in WrestlingCoach for SkillLevel with @Autowired annotation
 *  
 *  3)  in AnnotationDemo -> in bean retrieval -> change bean id to WrestlingCoach bean id -> run
 *  
 *  NOTE: @Autowired doesn't just work for setter methods, it works with any methods looking for SkillLevel
 *  
 *  
 *  --------- @Autowired @Qualifier ------------------------------------
 *  NOTE:  @Qualifier used to specificy which interface implementation we will use, when we have 
 *  		more than one implementation of the interface.
 *  		Any constructors used must have no args 
 *  
 *  	SETTER & FIELD INJECTIONS:
 *  1)  In each class that implements Coach interface, add @Qualifier("bean_id_of_SkillLevel_implementation")
 *  
 *  2)  If the class contains a constructor, change it to a no-arg (default) constructor
 *  
 *  	CONSTRUCTOR INJECTIONS:
 *  1)  Add @Qualifier("bean_id") inside the constructor args and set instance vars in constructor
 *  
 *  	public SwimCoach(@Qualifier("bean_id")Interface interfaceObject) {
 *  		this.interfaceObject = interfaceObject;
 *  	}
 *  
 *  ------------- values.properties Field Injections -------------------------------------
 *  
 *  1)  Create a properties file in src folder -> file contains key=value pairs
 *  
 *  2)  Load the properties file into xml config file
 *  	<context:property-placeholder location="classpath:fileName.properties" />
 *  
 *  3)  In SportCoach class, declare instance variables
 *  
 *  4)  Above variable declaration, add @Value("${keyName}")
 *  
 *  
 */
