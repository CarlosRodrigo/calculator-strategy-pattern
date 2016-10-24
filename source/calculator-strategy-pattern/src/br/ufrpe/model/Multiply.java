package br.ufrpe.model;

public class Multiply implements ICalculate {

	@Override
	public double calculate(double a, double b) {
		return a * b;
	}

}
