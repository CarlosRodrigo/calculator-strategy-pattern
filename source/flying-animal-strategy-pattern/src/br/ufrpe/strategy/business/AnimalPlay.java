package br.ufrpe.strategy.business;

import br.ufrpe.strategy.model.Animal;
import br.ufrpe.strategy.model.Bird;
import br.ufrpe.strategy.model.Dog;
import br.ufrpe.strategy.model.FlyRocketPowered;

public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("Dog: " + dog.performFly());
		
		System.out.println("Bird: " + bird.performFly());
		
		bird.setFlyBehavior(new FlyRocketPowered());
		
		System.out.println("Bird: " + bird.performFly());
	}
	
}