package test.java.com.sirma.itt.javacourse.generic;

import org.junit.Test;

import src.main.java.com.sirma.itt.javacourse.generic.Entry;
import src.main.java.com.sirma.itt.javacourse.generic.List;

/**
 * Tests the methods in the List class.
 * 
 * @author Nikolay Ch
 * 
 */
public class ListTest {

	/**
	 * Tests the insert and visit.
	 */
	@Test
	public void test() {
		List list = new List();

		Entry<String> asdf = new Entry<String>("adfasdfasdfa");
		list.insert(asdf);
		Entry<String> kolio = new Entry<String>("Kolio fi4eto");
		list.insert(kolio);
		Entry<String> ivan = new Entry<String>("aide sinite");
		list.insert(ivan);
		list.visit();
	}

}
