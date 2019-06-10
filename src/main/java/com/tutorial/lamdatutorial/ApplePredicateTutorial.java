package com.tutorial.lamdatutorial;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.tutorial.lamdatutorial.entities.Apple;
import com.tutorial.lamdatutorial.predicate.AppleColorPredicate;
import com.tutorial.lamdatutorial.predicate.AppleHeavyPredicate;
import com.tutorial.lamdatutorial.predicate.ApplePredicate;

public class ApplePredicateTutorial {
	static List<Apple> apples = null;

	public static void main(String[] args) {

		apples = Arrays.asList(new Apple(Color.RED, new Integer(150)), new Apple(Color.GREEN, new Integer(50)),
				new Apple(Color.CYAN, new Integer(300)));

		filterWithPredicateInstances();
		filterWithAnonymousClasses();
		filterWithLamda();

	}

	private static void filterWithPredicateInstances() {

		List<Apple> greenApples = filterAppleWithPredicate(apples, new AppleColorPredicate());
		List<Apple> heavyApples = filterAppleWithPredicate(apples, new AppleHeavyPredicate());

	}

	// No need to Implementations of ApplePredicate Interface
	private static void filterWithAnonymousClasses() {

		List<Apple> greenApples = filterAppleWithPredicate(apples, new ApplePredicate() {

			@Override
			public boolean test(Apple apple) {
				return apple.getColor().equals(Color.GREEN);
			}
		});

		List<Apple> heavyApples = filterAppleWithPredicate(apples, new ApplePredicate() {

			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() > 100;
			}
		});
	}

	// More concise code, no verbose code
	// No needs to *Predicate.java files
	// No needs to Anonymous class
	public static void filterWithLamda() {

		List<Apple> greenApples = filterAppleWithPredicate(apples, (Apple a) -> a.getColor().equals(Color.GREEN));
		List<Apple> heavyApples = filterAppleWithPredicate(apples, (Apple a) -> a.getWeight() > 100);
	};

	public static List<Apple> filterAppleWithPredicate(List<Apple> apples, ApplePredicate predicate) {

		List<Apple> filteredApples = new ArrayList();
		for (Apple apple : apples) {
			if (predicate.test(apple)) {
				filteredApples.add(apple);
			}
		}
		return filteredApples;

	}

}
