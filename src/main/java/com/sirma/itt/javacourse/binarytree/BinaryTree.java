package src.main.java.com.sirma.itt.javacourse.binarytree;

/**
 * The class with the methods for the tree.
 * 
 * @author Nikolay Ch
 * 
 */
public class BinaryTree {

	private int min;
	public static Node root;

	public BinaryTree() {
		root = null;
	}

	/**
	 * Gets the root of the tree.
	 * 
	 * @return the root
	 */
	public Node getRoot() {
		return root;
	}

	/**
	 * Method for visiting all the Nodes.
	 * 
	 * @param current
	 *            the current Node which we are visiting
	 */
	public static void visit(Node current) {
		if (current == null) {
			return;
		}
		visit(current.right);
		System.out.println("Visiting" + current.value + " ");
		visit(current.left);

		return;

	}

	/**
	 * 
	 * Inserts new Node. It starts from the root and checks if the inserted
	 * value is smaller than the value in the root, if it is true does the same
	 * check with the left child. If it is bigger does it with the right child.
	 * This is how it finds the place of the new Node.
	 * 
	 * @param current
	 *            the current node which will be compared with the inserted
	 *            value
	 * @param vale
	 *            the inserted value
	 * @param parent
	 *            the parent of the node
	 * @return the new tree
	 */

	public Node insert(Node current, int value, Node parent) {
		if (current == null) {
			current = new Node();
			current.setParent(parent);
			current.setLeft(null);
			current.setRight(null);
			current.setValue(value);

		} else if (value < current.value) {
			current.setLeft(insert(current.left, value, current));
		} else if (value > current.value) {
			current.setRight(insert(current.right, value, current));
		}

		return current;
	}

	/**
	 * The method which calls the recursive one. Always starts from the root.
	 * 
	 * @param value
	 *            the inserted value
	 */
	public void insert(int value) {
		root = insert(root, value, root);
	}

	/**
	 * Finds the minimum element of a tree. Starts from the root and goes only
	 * in left.
	 * 
	 * @param current
	 *            the current Node
	 * @return the value of the smallest element
	 */
	public int findMin(Node current) {

		if (current.left == null) {
			min = current.value;
			return min;
		}
		findMin(current.left);
		return min;
	}

}
