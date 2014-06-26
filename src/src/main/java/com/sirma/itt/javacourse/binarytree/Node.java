package src.main.java.com.sirma.itt.javacourse.binarytree;

/**
 * Defines the Node in binary tree with a left and right child, a parent and a
 * value.
 * 
 * @author Nikolay Ch
 * 
 */
public class Node {

	public Node left;
	public Node right;
	public Node parent;
	public int value;
	

	/**
	 * Methods for filling the Node's attributes.
	 * 
	 * @param the
	 *            value for the Node attribute
	 */

	public void setValue(int value) {
		this.value = value;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

}
