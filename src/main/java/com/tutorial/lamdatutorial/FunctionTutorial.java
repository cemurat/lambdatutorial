package com.tutorial.lamdatutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionTutorial {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("cemurat", "Lambda", "");
		List<Integer> stringLengthList = map(stringList, (String s) -> s.length());
		for (Integer integer : stringLengthList) {

			System.out.println("String length: " + integer);
		}

	}

	public static <T, R> List<R> map(List<T> list, Function<T, R> func) {
		List<R> mapped = new ArrayList<>();
		for (T t : list) {
			mapped.add(func.apply(t));
		}
		return mapped;
	}
}
