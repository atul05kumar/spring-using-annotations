package com.atul.spring;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You have a rondom Fortune!";
	}

}
