package src.test.java.com.sirma.itt.javacourse.sumator;

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
	@SuppressWarnings("static-access")
	@Test
	public void testSumatorWithIntegers() {

		Main.ia = 34;
		Main.ib = 432;
		if (sumator.Sumator(sumint.ia, sumint.ib) != (34 + 432)) {
			Assert.fail("Nope");
		}

	}

	/**
	 * Tests sumator with big integers.
	 */
	@SuppressWarnings("static-access")
	@Test
	public void TestSumatorWithBigIntegers() {

		sumint.sforbi = "4213532";

		if (sumator.Sumator(sumint.bia, sumint.bib) != "8427064") {
			Assert.fail("Nope");
		}

	}
}
