package br.ufrpe.strategy.model;

public abstract class Animal {

	private String name;
	private String sound;

	protected IFlyBehavior flyBehavior;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public String performFly() {
		return flyBehavior.fly();
	}

}
