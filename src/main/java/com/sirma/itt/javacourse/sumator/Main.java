package src.main.java.com.sirma.itt.javacourse.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;



/**
 * Class which uses the method sumator for different types.
 * 
 * @author Nikolay Ch
 *
 */
public class Main{
	public static int ia=12; //first integer
	public static int ib=32;//second integer
	public static float fa =(float) 1.43; //first float
	public static float fb=(float)2.43;// second float
	public static String sa="1241234";
	public static String sb="23145";
	
	public static String sforbi="1324151341";//the string for the big integer
	public static BigInteger bia=new BigInteger(sforbi);
	public static BigInteger bib=new BigInteger(sforbi);
	public static BigDecimal bda=new BigDecimal(bia);
	public static BigDecimal bdb=new BigDecimal(bib);
	
	/**
	 * Main method which calls Sumator with different types.
	 * @param args
	 */
	public static void main(String[] args){
		
		System.out.println(Sumator.Sumator(ia, ib));
		System.out.println(Sumator.Sumator(fa, fb));
		System.out.println(Sumator.Sumator(sa, sb));
		//bia=new BigInteger("213415324523452");
		System.out.println(Sumator.Sumator(bia, bib));
		System.out.println(Sumator.Sumator(bdb, bda));
	}
	
}