package com.gnguyen92.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScope {

	public static void main(String[] args) {
		
		// load spring xml config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean
		Coach myCoach1 = context.getBean("tennisCoach", Coach.class);
		Coach myCoach2 = context.getBean("tennisCoach", Coach.class);
				
		// call methods on bean
		boolean sameAddress = (myCoach1 == myCoach2);
		System.out.println("myCoach1 and myCoach2 pointing to same object: " + sameAddress);
		System.out.println("myCoach1 memory address: " + myCoach1);
		System.out.println("myCoach2 memory address: " + myCoach2);
		
		// close context
		context.close();
	}

}
