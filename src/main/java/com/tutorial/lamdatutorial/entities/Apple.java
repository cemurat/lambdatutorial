package com.tutorial.lamdatutorial.entities;

public class Apple {

	private String colour;
	private Integer weight;

	public Apple(String colour, Integer weight) {
		this.colour = colour;
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple: colour= " + colour + ",weight= " + weight;
	}

}
