import static org.junit.Assert.*;

import org.junit.Test;


public class PerimetroDoRetanguloTest {

	@Test
	public void perimetro() {
		double lado1 = 4.5;
		double lado2 = 5.5;
		double resultado = CalculaPerimetro.calculo(lado1, lado2);
		assertEquals(20, resultado, 0);
	}

}
