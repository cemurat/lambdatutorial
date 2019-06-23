package com.tutorial.lamdatutorial;

import java.awt.Color;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.tutorial.lamdatutorial.entities.Apple;

public class ComparatorTutorial {

	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(new Apple(Color.RED, new Integer(100)),
				new Apple(Color.BLUE, new Integer(300)), new Apple(Color.BLUE, new Integer(50)));

		// Anonymous class
		apples.sort(new Comparator<Apple>() {
			@Override
			public int compare(Apple apple1, Apple apple2) {
				return apple1.getWeight().compareTo(apple2.getWeight());
			}
		});

		// Just single line with lambda
		apples.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
	}

}
