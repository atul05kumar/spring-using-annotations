package com.atul.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private FortuneService theFortuneService;
	
	@Autowired
	public TennisCoach(FortuneService happyFortune) {
		theFortuneService = happyFortune;
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
