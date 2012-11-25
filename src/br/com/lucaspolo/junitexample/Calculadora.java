package br.com.lucaspolo.junitexample;

public class Calculadora {
	public int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public double divisao(double num1, double num2) throws CalculadoraException{
		if(num2 == 0) { 
			throw new CalculadoraException("A divisão não pode ser por zero");
		}
		return num1/num2;
	}
}
