package com.atul.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService theFortuneService;
	/*
	@Autowired
	public TennisCoach(FortuneService happyFortune) {
		theFortuneService = happyFortune;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor.");
	}
	
	@Autowired
	public void setFortuneService(FortuneService myFortuneService) {
		System.out.println(">> TennisCoach: Inside setFortuneService method!.");
		theFortuneService = myFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

	@Override
	public String getDailyFortune() {
		return theFortuneService.getFortune();
	}

}
