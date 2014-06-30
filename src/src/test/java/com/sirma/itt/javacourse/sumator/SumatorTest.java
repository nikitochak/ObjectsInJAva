package src.test.java.com.sirma.itt.javacourse.sumator;

import static org.testng.AssertJUnit.assertEquals;
import src.main.java.com.sirma.itt.javacourse.sumator.*;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Test sumator.
 * 
 * @author Nikolay Ch
 * 
 */
public class SumatorTest {
	Sumator sumator = new Sumator();
	Main sumint = new Main();

	/**
	 * Tests sumator with Integers.
	 */

	@Test
	public void testSumatorWithIntegers() {

		Main.ia = 34;
		Main.ib = 432;
		assertEquals(Sumator.sumator(Main.ia, Main.ib), (34 + 432));

	}

	/**
	 * Tests sumator with big integers.
	 */

	@Test
	public void TestSumatorWithBigIntegers() {

		Main.sforbi = "4213532";

		if (Sumator.sumator(Main.bia, Main.bib) != "8427064") {
			Assert.fail("Nope");
		}

	}
}
