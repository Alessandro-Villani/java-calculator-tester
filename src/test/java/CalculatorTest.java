import java.util.Random;

import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Random rand = new Random();
	
	@RepeatedTest(10)
	public void sumTest() {
		
		final float x = rand.nextFloat(0, 100);
		final float y = rand.nextFloat(0, 100);
		
		final float att = x + y;
		
		final float res = Calculator.add(x, y);
		
		assertEquals(att, res);
		
		
	}
	
	@RepeatedTest(10)
	public void subtractTest() {
		
		final float x = rand.nextFloat(0, 100);
		final float y = rand.nextFloat(0, 100);
		
		final float att = x - y;
		
		final float res = Calculator.subtract(x, y);
		
		assertEquals(att, res);
		
	}
	
	@RepeatedTest(10)
	public void divideTest() throws Exception {
		
		final float x = rand.nextFloat(0, 100);
		final float y = rand.nextFloat(0, 100);
		
		assumeTrue(y != 0);
		
		final float att = x/y;
		
		final float res = Calculator.divide(x, y);
		
		assertEquals(att, res);
		
	}
	
	@RepeatedTest(10)
	public void divideExcTest() throws Exception {
		
		final float x = rand.nextFloat(0, 100);
		final float y = rand.nextInt(6);
		
		assumeTrue(y == 0);
		
		assertThrows(Exception.class, ()->Calculator.divide(x, y));
		
	}
	
	@RepeatedTest(10)
	public void multiplyTest() {
		
		final float x = rand.nextFloat(0, 100);
		final float y = rand.nextFloat(0, 100);
		
		final float att = x * y;
		
		final float res = Calculator.multiply(x, y);
		
		assertEquals(att, res);
		
	}

}
