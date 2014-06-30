package src.main.java.com.sirma.itt.javacourse.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Class with the method Sumator for integers , floats , strings , big integers
 * and big decimals.
 * 
 * @author Nikolay Ch
 * 
 */
public class Sumator {

	/**
	 * 
	 * Sums two integers.
	 * 
	 * @param a
	 *            the first integer
	 * @param b
	 *            the second integer
	 * @return the sum of a and b
	 */
	public static int sumator(int first, int second) {
		return first + second;
	}

	/**
	 * 
	 * Overrides the method sumator for summing twofloat numbers.
	 * 
	 * @param a
	 *            the first float
	 * @param b
	 *            the second float
	 * @return the sum of a and b
	 */
	public static float sumator(float a, float b) {
		return a + b;
	}

	/**
	 * 
	 * Overloads the method sumator for summing two strings.
	 * 
	 * @param a
	 *            the first String
	 * @param b
	 *            the second String
	 * @return the sum of a and b
	 */
	public static String sumator(String a, String b) {
		return a + b;
	}

	/**
	 * 
	 * Overrides the method Sumator for summing two big integer numbers.
	 * 
	 * @param a
	 *            the first big integer
	 * @param b
	 *            the second big integer
	 * @return the sum of a and b
	 */
	public static String sumator(BigInteger a, BigInteger b) {
		return a.add(b).toString();
	}

	/**
	 * 
	 * Overrides the method Sumator for summing two big decimal numbers.
	 * 
	 * @param first
	 *            the first big decimal
	 * @param second
	 *            the second big decimal
	 * @return the sum of first and second
	 */
	public static String sumator(BigDecimal first, BigDecimal second) {
		return first.add(second).toString();
	}
}