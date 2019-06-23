package com.tutorial.lamdatutorial;

public class RunnableTutorial {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Thread 1 with anonymous class");
			}
		});

		t1.start();

		Thread t2 = new Thread(() -> System.out.println("Thread 2 with lambda expression"));
		t2.start();
	}

}
