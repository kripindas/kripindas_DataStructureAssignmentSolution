package com.greatlearning.skewedtree;

public class Main {

	public static void main(String[] args) {

		System.out.println("---- Binary Tree To Right Skewed Tree----");

		SkewedTree tree = new SkewedTree();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		int order = 0;
		Node headNode = tree.convertToSkewedTree(tree.node, order);
		System.out.println("Right skewed tree:");
		tree.traverseRightSkewedTree(headNode);
	}

}
