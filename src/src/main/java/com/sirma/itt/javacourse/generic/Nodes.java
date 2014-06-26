package src.main.java.com.sirma.itt.javacourse.generic;

/**
 * This class makes the nodes of the tree with an type variable attribute.
 * 
 * @author Nikolay Ch
 * 
 */
public class Nodes {

	private Nodes child; // the child of the node
	private Entry<String> info; // the generic attribute

	/**
	 * Method for finding the value of a node.
	 * 
	 * @return the value of the node
	 */
	public Entry<String> getInfo() {
		return info;
	}

	/**
	 * Initializes the value of the node.
	 * 
	 * @param info
	 */
	public void setInfo(Entry<String> info) {
		this.info = info;
	}

	/**
	 * Initializes the child of the node.
	 * 
	 * @param child
	 */
	public void setChild(Nodes child) {
		this.child = child;
	}

	/**
	 * Gets the child of the node.
	 * 
	 * @return the child of the node
	 */
	public Nodes getChild() {
		return this.child;
	}

}
