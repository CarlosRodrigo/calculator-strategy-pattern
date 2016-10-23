package br.ufrpe.strategy.model;

public class Bird extends Animal {

	public Bird() {
		flyBehavior = new FlyWithWings();
	}

}
