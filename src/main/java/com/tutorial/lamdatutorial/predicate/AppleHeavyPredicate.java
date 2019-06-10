package com.tutorial.lamdatutorial.predicate;

import com.tutorial.lamdatutorial.entities.Apple;

public class AppleHeavyPredicate implements ApplePredicate {

	public boolean test(Apple apple) {
		return apple.getWeight() > 100;
	}

}
