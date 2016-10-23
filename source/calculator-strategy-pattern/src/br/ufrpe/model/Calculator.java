package br.ufrpe.model;

public class Calculator {

	public double plus(double a, double b) {
		return new Plus().calculate(a, b);
	}

	public double minus(double a, double b) {
		return new Minus().calculate(a, b);
	}

	public double multiply(double a, double b) {
		return new Multiply().calculate(a, b);
	}

	public double divide(double a, double b) {
		return new Divide().calculate(a, b);
	}

}
