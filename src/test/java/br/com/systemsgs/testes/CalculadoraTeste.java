package br.com.systemsgs.testes;

import org.junit.Before;
import org.junit.Test;
import org.assertj.core.api.Assertions;

public class CalculadoraTeste {
	
	Calculadora calculadora;
	int num1 = 10, num2 = 5;
	
	@Before
	public void inicializaCalculadora() {
		calculadora = new Calculadora();
	}
	
	@Test
	public void testandoNumeros() {
		
		int resultado = calculadora.somar(num1, num2);
		
		Assertions.assertThat(resultado).isEqualTo(15);
		
	}
	
	@Test
	public void testeMultiplicacaoDeNumeros() {
		
	int resultado =	calculadora.multiplica(num1, num2);
	
	Assertions.assertThat(resultado).isEqualTo(50);
		
	}
	
	@Test
	public void testeSubtrairNumerosMaiorQueZero() {
		
	int resultado = calculadora.subtrair(num1, num2);
	
	Assertions.assertThat(resultado).isEqualTo(5);
		
	}
	
	@Test
	public void testeDivisaoNumeros() {
		
		float resultado = calculadora.dividir(num1, num2);
		
		Assertions.assertThat(resultado).isEqualTo(2);
		
	}
	
	@Test
	public void naoDeveDividirPorZero() {
		
		int num1 = 10, num2 = 0;
		
		calculadora.dividir(num1, num2);
		
	}

}

class Calculadora {
	
	int somar (int num1, int num2) {
		
		if (num1 <0 || num2 < 0) {
			throw new RuntimeException("Não é permitido somar numeros negativos");
		}
		
		return num1+num2;
		
	}
	
	int multiplica (int num1, int num2) {
		
		return num1 * num2;
	}
	
	int subtrair (int num1, int num2) {
		
		return num1 - num2;
		
	}
	
	float dividir(int num1, int num2) {
		
		return num1 / num2;
		
	}
	
}
