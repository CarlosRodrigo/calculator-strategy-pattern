package br.ufrpe.strategy.model;

public class Animal {

	private String name;
	private String sound;

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

	public String fly() {
		return "I'm flying";
	}

}
