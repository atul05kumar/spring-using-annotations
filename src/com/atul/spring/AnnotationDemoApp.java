package com.atul.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		//read the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//get the bean from spring container
		Coach myCricketCoach = context.getBean("myCricketCoach", Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call a method on the bean
		System.out.println(myCricketCoach.getDailyWorkout());
		
		//call the method via constructor injection
		System.out.println(theCoach.getDailyFortune());
		
		//close the contest
		context.close();
	}

}
