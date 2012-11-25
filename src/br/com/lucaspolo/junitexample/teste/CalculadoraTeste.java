package br.com.lucaspolo.junitexample.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.lucaspolo.junitexample.Calculadora;

public class CalculadoraTeste {
	Calculadora calculadora;
	
	@Before
	public void setUp() {
		calculadora = new Calculadora();
	}

	@Test
	public void somaTeste() {
		int resultado = calculadora.soma(5,4);
		assertEquals(9, resultado);
	}
	
	@Test
	public void somaTestePontoFlutuante() {
		double resultado = calculadora.soma(4.3, 2.2);
		assertEquals(6.5, resultado, 0.1);
	}
}
