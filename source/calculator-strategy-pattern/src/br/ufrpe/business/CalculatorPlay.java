package br.ufrpe.business;

import br.ufrpe.model.Calculator;

public class CalculatorPlay {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double a = 4;
		double b = 3;
		
		System.out.println(a + " + " + b  +" = " + calculator.plus(a, b));
		
		System.out.println(a + " - " + b  +" = " + calculator.minus(a, b));
		
		System.out.println(a + " * " + b  +" = " + calculator.multiply(a, b));
		
		System.out.println(a + " / " + b  +" = " + calculator.divide(a, b));
	}
	
}
