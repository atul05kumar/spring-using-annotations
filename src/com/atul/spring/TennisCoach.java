package com.atul.spring;

import org.springframework.stereotype.Component;

@Component("thatTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley!";
	}

}