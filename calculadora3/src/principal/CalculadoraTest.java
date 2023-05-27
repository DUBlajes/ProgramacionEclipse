package principal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		double valoresperado=30;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.suma();
		assertEquals(valoresperado,resultado,0);
	}

	@Test
	void testResta() {
		double valoresperado=10;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.resta();
		assertEquals(valoresperado,resultado,0);
	}
	
	@Test
	void testResta2() {
		double valoresperado=10;
		Calculadora calcu= new Calculadora (40,10);
		double resultado= calcu.resta();
		assertEquals(valoresperado,resultado,0);
	}

	@Test
	void testMultiplica() {
		double valoresperado=200;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.multiplica();
		assertEquals(valoresperado,resultado,0);
	}

	@Test
	void testDivide() {
		double valoresperado=2;
		Calculadora calcu= new Calculadora (20,10);
		double resultado= calcu.divide();
		assertEquals(valoresperado,resultado,0);
	}

}
