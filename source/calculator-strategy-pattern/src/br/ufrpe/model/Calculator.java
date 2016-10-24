package br.ufrpe.model;

public class Calculator {

	private ICalculate calculatorStrategy;
	
	public double calculate(double a, double b) {
		return calculatorStrategy.calculate(a, b);
	}
	
	public void setCalculate(ICalculate calculatorStrategy) {
		this.calculatorStrategy = calculatorStrategy;
	}

}
