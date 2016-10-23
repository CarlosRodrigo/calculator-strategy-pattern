package br.ufrpe.strategy.model;

public class FlyRocketPowered implements IFlyBehavior {

	@Override
	public String fly() {
		return "I'm flying with a rocket!!!";
	}

}
