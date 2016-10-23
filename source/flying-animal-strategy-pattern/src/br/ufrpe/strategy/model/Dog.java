package br.ufrpe.strategy.model;

public class Dog extends Animal {

	public void digHole() {

		System.out.println("Dug a hole");

	}

	@Override
	public String fly() {
		return "I can't fly";
	}

}
