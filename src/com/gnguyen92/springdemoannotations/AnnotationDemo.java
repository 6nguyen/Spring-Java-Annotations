package com.gnguyen92.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		
		//  load spring xml config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retreive the bean
		Coach myCoach = context.getBean("theCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(myCoach.getDailyWorkout());
		
		// 	close the context
		context.close();

	}

}
