package TesteAppCalculadora;

import static org.junit.Assert.*;

import org.junit.Test;

import FontesAppCalculadora.CalculadoraAritmetica;

public class CalculadoraAritmeticaTeste {

	
	//Atributos de comparação de resultados 
	private int resultadoReal;
	private int resultadoEsperado;
	
	@Test
	public void testeSomar() {
		resultadoEsperado = 5;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(2,3);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeSomar2() {
		resultadoEsperado = 4;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(1,3);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void testeSomar3() {
		resultadoEsperado = 19;
		CalculadoraAritmetica calc = new CalculadoraAritmetica();
		resultadoReal = calc.soma(10,9);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	

}
