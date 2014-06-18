package src.main.java.com.sirma.itt.javacourse.generic;

/**
 * Generic class with one type variable.
 * 
 * @author Nikolay Ch
 * 
 * 
 * @param <V>
 *            the type of the name variable
 */
public class Entry<V> {

	private V name;

	/**
	 *Generic constructor for the class.
	 * 
	 * @param v
	 *            the value of the name attribute
	 */
	public Entry(V v) {
		name = v;

	}

	/**
	 * Initializes the attribute name with type V.
	 * 
	 * @param name
	 *            the value
	 */
	public void setName(V name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name + " ";
	}

}