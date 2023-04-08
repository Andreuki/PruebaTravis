package travis;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import org.junit.runners.Parameterized.Parameters;


public class CalculadoraTest {
	  public CalculadoraTest() {
	  }

	 @Parameters
	 public static Collection<Object[]> numeros() {

	   return Arrays.asList(new Object [][] {

	   {20, 10, 2}, {30, -2, 15}, {5, 2, 3}

	 });

	}

	@Test
	public void testDivide() {

	    Calculadora calcu =new Calculadora(20, 2);

	    int resultado = calcu.divide();

	    assertEquals(10, resultado);

	}

}
