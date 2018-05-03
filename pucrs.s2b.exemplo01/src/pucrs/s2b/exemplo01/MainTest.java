package pucrs.s2b.exemplo01;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void testSomar() {
		int expected = 50;
		int actual = Main.somar(20, 30);
		assertEquals(expected, actual);
	}

	@Test
	public void testSomar2() {
		assertEquals(0, Main.somar(0, 0));
	}
}