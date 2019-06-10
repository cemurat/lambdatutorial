package com.tutorial.lamdatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTutorial {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("Murat", "", "Lamda", "");

		List<String> nonEmptyStringList = filter(stringList, (String s) -> (!s.isEmpty()));

		for (String string : nonEmptyStringList) {
			System.out.println("String: " + string);
		}

	}

	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> filteredList = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				filteredList.add(t);
			}
		}
		return filteredList;
	}

}
