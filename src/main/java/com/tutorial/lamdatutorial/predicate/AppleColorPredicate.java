package com.tutorial.lamdatutorial.predicate;

import java.awt.Color;

import com.tutorial.lamdatutorial.entities.Apple;

public class AppleColorPredicate implements ApplePredicate {

	public boolean test(Apple apple) {
		return apple.getColor().equals(Color.GREEN);
	}
}
