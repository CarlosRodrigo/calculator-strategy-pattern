package br.ufrpe.business;

import br.ufrpe.model.Calculator;
import br.ufrpe.model.Divide;
import br.ufrpe.model.Minus;
import br.ufrpe.model.Multiply;
import br.ufrpe.model.Plus;

public class CalculatorPlay {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double a = 4;
		double b = 3;
		
		calculator.setCalculate(new Plus());
		System.out.println(a + " + " + b  +" = " + calculator.calculate(a, b));
		
		calculator.setCalculate(new Minus());
		System.out.println(a + " - " + b  +" = " + calculator.calculate(a, b));
		
		calculator.setCalculate(new Multiply());
		System.out.println(a + " * " + b  +" = " + calculator.calculate(a, b));
		
		calculator.setCalculate(new Divide());
		System.out.println(a + " / " + b  +" = " + calculator.calculate(a, b));
	}
	
}
