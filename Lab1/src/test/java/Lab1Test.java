import java.util.*;

import static org.junit.Assert.*;
import org.junit.Test;

public class Lab1Test {

	String[] promotionOrder = new String[] { "mz", "mx", "my" };
	
	void assertResults(String[] expected, String[] actual) {
		assertTrue(expected.length == actual.length);
		for (int i = 0; i < expected.length; i++) {
			assertTrue(expected[i].equalsIgnoreCase(actual[i]));
		}
	}

	@Test
	public void TestCase1() {
		String[] carInventory = new String[] { "mz", "my", "my", "mx", "mz", "mx", "my", "mz" };
		String[] expectedRes = new String[] { "mz", "mz", "mz", "mx", "mx", "my", "my", "my" };
		String[] actualRes = Lab1.sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);		
	}

	@Test
	public void TestCase2() {
		String[] carInventory = new String[] { "mx", "mz" };
		String[] expectedRes = new String[] { "mz", "mx" };
		String[] actualRes = Lab1.sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);
	}

	@Test
	public void TestCase3() {
		String[] carInventory = new String[] { "mx" };
		String[] expectedRes = new String[] { "mx" };
		String[] actualRes = Lab1.sortCarInventory(carInventory, promotionOrder);
		assertResults(expectedRes, actualRes);
	}
}