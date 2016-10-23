package br.ufrpe.strategy.model;

public class FlyNoWay implements IFlyBehavior {

	@Override
	public String fly() {
		return "I can't fly!";
	}

}
