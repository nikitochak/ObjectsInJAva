package src.test.java.com.sirma.itt.javacourse.binarytree;

import org.testng.Assert;
import org.testng.annotations.Test;

import src.main.java.com.sirma.itt.javacourse.binarytree.*;

/**
 * 
 * Tests some methods involved with binary tree.
 * 
 * @author Nikolay Ch
 * 
 */
public class BinaryTreeTest {
	BinaryTree tree = new BinaryTree();

	/**
	 * Tests the insert of a new node to the tree.
	 */
	@Test
	public void testInsertWithDifferentNumbers() {

		tree.insert(45);
		BinaryTree.visit(tree.getRoot());
		System.out.println("\n" + "this is after second: ");
		tree.insert(432);
		BinaryTree.visit(tree.getRoot());
		System.out.println("\n" + "this is after third: ");
		tree.insert(12);
		BinaryTree.visit(tree.getRoot());
		System.out.println("\n" + "this is after forth: ");
		tree.insert(23);
		BinaryTree.visit(tree.getRoot());

		if(tree.findMin(tree.getRoot())!=12){
			Assert.fail("Nope");
		}

	}

}
