package TesteAppCalculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	// Executado antes dos testes 
	@Before 
	public void inicioTeste() { 
	System.out.println("Inciando a execução dos testes !"); 
	} 
	// Executado depois de cada teste 
	@After 
	public void terminoTeste() {
	System.out.println("Executando @After"); 
	} 
	
	
	//Lista de testes – Before será executado antes de cada teste
	//After será executado após cada teste
	//Atributos de comparação de resultados 
	
	
	private double resultadoReal;
	private int resultadoEsperado;
	
	@Test
	public void testeSomar() {
		resultadoEsperado = 5;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(2,3);
		assertEquals(resultadoEsperado, resultadoReal,0);
	}
	
	@Test
	public void testeSomar2() {
		resultadoEsperado = 4;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(1,3);
		assertEquals(resultadoEsperado, resultadoReal,0);
	}
	
	@Test
	public void testeSomar3() {
		resultadoEsperado = 19;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(10,9);
		assertEquals(resultadoEsperado, resultadoReal,0);
	}
	
	@Test 
	public void dividir98por5() {
		double nr1 = 5;
		double nr2 =98;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		double resultadoEsperado = 0.05102;
		resultadoReal = calc.divide(nr1, nr2);
		assertEquals(resultadoReal, resultadoEsperado, 0.00001);
		
		
	}
	

}
