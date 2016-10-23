package br.ufrpe.strategy.business;

import br.ufrpe.strategy.model.Animal;
import br.ufrpe.strategy.model.Bird;
import br.ufrpe.strategy.model.Dog;

public class AnimalPlay{
	
	public static void main(String[] args){
		
		Animal dog = new Dog();
		Animal bird = new Bird();
		
		System.out.println("Dog: " + dog.fly());
		
		System.out.println("Bird: " + bird.fly());
		
	}
	
}