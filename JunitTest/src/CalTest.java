
package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Test.CalTest;

public class CalTest {
	Cal c=new Cal();
	@Test
	public void testAdd() {
		assertEquals(6, c.add(4, 2));
		assertNotEquals(7, c.add(4, 2));
	}

	@Test
	public void testSub() {
		assertEquals(2, c.sub(4, 2));
		assertNotEquals(7, c.sub(4, 2));
	}

	@Test
	public void testMul() {
		assertEquals(8, c.mul(4, 2));
		assertNotEquals(9, c.mul(4, 2));
	}

	@Test
	public void testDiv() {
		assertEquals(5, c.div(10, 2), 0.0001);
		//assertEquals(5, c.div(10, 2));
		assertNotEquals(6, c.div(10, 2), 0.0001);
	}

}