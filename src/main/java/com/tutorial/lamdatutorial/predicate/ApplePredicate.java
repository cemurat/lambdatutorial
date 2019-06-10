package com.tutorial.lamdatutorial.predicate;

import com.tutorial.lamdatutorial.entities.Apple;

@FunctionalInterface
public interface ApplePredicate {
	public boolean test(Apple apple);

}
