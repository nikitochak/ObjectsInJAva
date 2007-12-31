package main.java.com.sirma.itt.javacourse.sumator;

import java.math.*;

/**
 * Class which sums Integer numbers, floating point numbers, Strings and objects
 * by redefinition of the the mathod sum.
 * 
 * @author Nikolay Ch
 * 
 */
public class Sumator {
	static BigInteger BigIntSum = new BigInteger("0");

	static BigDecimal BigDecSum = new BigDecimal(0);

	/**
	 * First definition of the method for summing two integers.
	 * 
	 * @param a
	 *            the first integer number
	 * @param b
	 *            the second integer number
	 * @return the sum of the numers
	 */
	static int sum(int a, int b) {
		return a + b;
	}

	/**
	 * Redefinition of the method sum which returns the sum of two float
	 * numbers.
	 * 
	 * @param a
	 *            the first float number
	 * @param b
	 *            the second float number
	 * @return the sum of the numbers
	 */
	static float sum(float a, float b) {
		return a + b;
	}

	/**
	 * Redefinition of the method sum which returns the sum of two Strings.
	 * 
	 * @param a
	 *            the first String
	 * @param b
	 *            the second String
	 * @return the sum of the Strings
	 */
	static String sum(String a, String b) {
		return a + b;
	}

	/**
	 * Redefinition of the method sum which returns the sum of two BigIntegers.
	 * 
	 * @param a
	 *            the first BigInteger
	 * @param b
	 *            the second BigInteger
	 * @return the sum of the BigIntegers
	 */
	static String sum(BigInteger a, BigInteger b) {

		BigIntSum = BigIntSum.add(a);
		BigIntSum = BigIntSum.add(b);
		return BigIntSum.toString();
	}

	/**
	 * Overriding the method sum for finding the sum of two big decimal numbers.
	 * 
	 * @param a
	 *            the first big decimal number
	 * @param b
	 *            the second big decimal number
	 * @return the sum of the two big decimals numbers
	 */
	static String sum(BigDecimal a, BigDecimal b) {

		BigDecSum = BigDecSum.add(a);
		BigDecSum = BigDecSum.add(b);
		return BigDecSum.toString();
	}
}
