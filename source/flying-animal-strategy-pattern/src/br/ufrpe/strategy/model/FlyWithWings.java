package br.ufrpe.strategy.model;

public class FlyWithWings implements IFlyBehavior {

	@Override
	public String fly() {
		return "I'm flying!!";
	}

}
