package com.atul.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//field injection using reflection
	@Autowired
	private FortuneService theFortuneService;
	
	/*Autowiring via a constructor
	@Autowired
	public TennisCoach(FortuneService happyFortune) {
		theFortuneService = happyFortune;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor.");
	}
	
	/*Autowiring via a setter method.
	@Autowired
	public void setFortuneService(FortuneService myFortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService method!.");
		theFortuneService = myFortuneService;
	}
	*/
	
	/*@Autowired works on any method not just on setters and constructors
	@Autowired
	public void doSomeCrazyStuff(FortuneService myFortuneService) {
		System.out.println(">> TennisCoach: Inside doSomeCrazyStuff method!.");
		theFortuneService = myFortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}

}
