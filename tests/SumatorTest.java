package src.tests;
import src.main.java.com.sirma.itt.javacourse.sumator.*;
import org.testng.annotations.Test;

/**
 * Test sumator.
 * 
 * @author Nikolay Ch
 *
 */
public class SumatorTest {
	Sumator sumator=new Sumator();
	  Main sumint=new Main();
	
	@Test
  public void TestSumatorWithIntegers() {
	  
	  sumint.ia=34;
	  sumint.ib=432;
	  System.out.println(sumator.Sumator(sumint.ia, sumint.ib));
	  
  }
	@Test
	  public void TestSumatorWithBigIntegers() {
		  
		  sumint.sforbi="4213532";
		 //test sumator for big integers
		  System.out.println(sumator.Sumator(sumint.bia, sumint.bib));
		  
	  }
}
