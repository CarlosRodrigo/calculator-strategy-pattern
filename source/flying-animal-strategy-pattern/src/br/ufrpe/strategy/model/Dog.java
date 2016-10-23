package br.ufrpe.strategy.model;

public class Dog extends Animal {

	public Dog() {
		flyBehavior = new FlyNoWay();
	}
	
	public void digHole() {
		System.out.println("Dug a hole");
	}

}
