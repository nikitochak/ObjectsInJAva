package main.java.com.sirma.itt.javacourse.sumator;

/**
 * This class uses the method sum defined in class Sumator.
 * 
 * 
 * @author Nikolay Ch
 * 
 */

public class Main {

	/**
	 * The main method which calls the sum method for Integers, Floats ,
	 * Strings,big decimals and big integers.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 13;

		int sum = Sumator.sum(a, b);
		System.out.println("The sum of the  two Integers is " + sum + " .");

		float c = (float) 432.43;
		float f = (float) 134.12344;
		float sumf = (float) (Sumator.sum(c, f));
		System.out.println("The sum of the  two Floats is " + sumf + " .");

		String first = "dsaf";
		String second = "asdf";
		String sumS = Sumator.sum(first, second);
		System.out.println("The sum of the  two Strings is " + sumS + " .");

		String BigIntF = "123478123648";
		String BigIntS = "53452123648";

		String resultBigInt = Sumator.sum(BigIntF, BigIntS);
		System.out.println("The sum of the  two BigIntegers is " + resultBigInt
				+ " .");
	}

}
