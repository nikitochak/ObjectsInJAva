package src.main.java.com.sirma.itt.javacourse.binarytree;

/**
 * 
 * Shows some mathods with binary tree.
 * 
 * @author Nikolay Ch
 * 
 */
public class Main {

	/**
	 * The main method with the initialize of the tree and the methods.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree done = new BinaryTree();

		done.insert(0);
		done.insert(5);
		done.insert(-13);

		done.insert(3);

		done.insert(-5);
		done.insert(1);
		done.insert(4);
		done.insert(1);
		done.insert(18);
		done.insert(2);

		BinaryTree.visit(done.getRoot());
		System.out.print("The smallest value is: "
				+ done.findMin(done.getRoot()) + " .");

	}
}
