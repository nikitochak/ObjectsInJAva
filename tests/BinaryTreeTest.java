package src.tests;


import org.testng.annotations.Test;

import src.main.java.com.sirma.itt.javacourse.binarytree.*;
public class BinaryTreeTest {
	BinaryTree tree=new BinaryTree();
	
	@Test
  public void TestInsert() {
		
		tree.insert(45);
		BinaryTree.visit(tree.getRoot());
		System.out.println("\n"+"this is after second: ");
		tree.insert(432);
		BinaryTree.visit(tree.getRoot());
		System.out.println("\n"+"this is after third: ");
		tree.insert(12);
		BinaryTree.visit(tree.getRoot());
		System.out.println("\n"+"this is after forth: ");
		tree.insert(23);
		BinaryTree.visit(tree.getRoot());
		
		System.out.println("\n now the min :" + tree.findMin(tree.getRoot()));
		
		
  }

}
