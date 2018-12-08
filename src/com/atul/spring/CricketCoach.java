package com.atul.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myCricketCoach")
public class CricketCoach implements Coach {
	
	@Value("${coach.ground}")
	private String ground;

	@Override
	public String getDailyWorkout() {
		return "Practice batting in " + ground + " ground!";
	}

	@Override
	public String getDailyFortune() {
		return "Cricket Fortune!";
	}

}
