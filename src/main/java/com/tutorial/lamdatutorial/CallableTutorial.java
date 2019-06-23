package com.tutorial.lamdatutorial;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTutorial {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService service = Executors.newCachedThreadPool();

		Future<String> result = service.submit(new Callable<String>() {

			@Override
			public String call() throws Exception {
				return "Callable with Anonymous class";
			}
		});

		Future<String> otherResult = service.submit(() -> "Callable with Lambda class");

		System.out.println(result.get());
		System.out.println(otherResult.get());

	}

}
