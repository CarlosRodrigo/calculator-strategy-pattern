package br.ufrpe.strategy.model;

public class Bird extends Animal {

	// The constructor initializes all objects

	public Bird() {

		setSound("Tweet");

	}

	@Override
	public String fly() {
		return "I'm flying";
	}

}
