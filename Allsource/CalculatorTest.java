import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	protected Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
		
	}

	@Test
	public void testSetValue() {
		calc.setValue( 5 );
		assertEquals( 5, calc.getValue() );
	}

	@Test
	public void testAdd() {
		calc.add(5);
		assertEquals (5, calc.getValue());
	}

	@Test
	public void testDivideBy() {
		calc.setValue(10);
		calc.divideBy(5);
		assertEquals (2, calc.getValue());
	}

}
