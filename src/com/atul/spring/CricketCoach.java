package com.atul.spring;

import org.springframework.stereotype.Component;

@Component("myCricketCoach")
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice batting in the nets!";
	}

}
