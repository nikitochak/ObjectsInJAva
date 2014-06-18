package src.main.java.com.sirma.itt.javacourse.generic;

/**
 * The main class for inputing some type variables.
 * 
 * @author Admin
 *
 */
public class Main {
		
	/**
	 * The main method which inputs some new type variables in the list. 
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		
		List list=new List();
		Entry<String> asdf=new Entry<String>("adfasdfasdfa");
		
		list.insert(asdf);
		Entry<String> kolio=new Entry<String> ("Kolio fi4eto");
		list.insert(kolio);
		Entry<String> ivan=new Entry<String> ("aide sinite");
		list.insert(ivan);
		list.visit();
	}
	
}
