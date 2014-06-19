package src.main.java.com.sirma.itt.javacourse.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Class with the method Sumator for integers , floats , strings , big integers and big decimals.
 * 
 * @author Nikolay Ch
 *
 */
public class Sumator {

	private static BigInteger sumint=new BigInteger("0");

	private static BigDecimal sumdec=new BigDecimal(0);
	/**
	 * 
	 *  Sums two integers.
	 * 
	 * @param a
	 *            the first integer
	 * @param b
	 *            the second integer
	 * @return the sum of a and b
	 */
	public static int Sumator(int a, int b) {
		return a + b;
	}
	/**
	 * 
	 * Overrides the method Sumator for summing twofloat numbers.
	 * 
	 * @param a
	 *            the first float
	 * @param b
	 *            the second float
	 * @return the sum of a and b
	 */
	public static float Sumator(float a, float b) {
		return a + b;
	}
	/**
	 * 
	 * Overrides the method Sumator for summing two strings.
	 * 
	 * @param a
	 *            the first String
	 * @param b
	 *            the second String
	 * @return the sum of a and b
	 */
	public static String Sumator(String a, String b) {
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
	public static BigInteger Sumator(BigInteger a, BigInteger b) {
		sumint=sumint.add(a);
		sumint=sumint.add(b);
		return sumint;
	}

	/**
	 * 
	 * Overrides the method Sumator for summing two big decimal numbers.
	 * 
	 * @param a
	 *            the first big decimal
	 * @param b
	 *            the second big decimal
	 * @return the sum of a and b
	 */
	public static BigDecimal Sumator(BigDecimal a, BigDecimal b) {
		sumdec=sumdec.add(a);
		sumdec=sumdec.add(b);
		return sumdec;
	}
}