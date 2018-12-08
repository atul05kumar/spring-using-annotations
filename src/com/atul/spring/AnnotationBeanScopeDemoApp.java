package com.atul.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	
	public static void main(String [] args) {
		
		//load the spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		//print the results.
		Boolean result = (tennisCoach == alphaCoach);
		System.out.println("Pointing to the same object " + result);
		
		System.out.println("Memory location of tennisCoach is " + tennisCoach);
		
		System.out.println("Memory location of alphaCoach is " + alphaCoach);
		
		//close the context.
		context.close();
	}

}
