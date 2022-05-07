package com.greatlearning.skewedtree;

class Node {
	int key;
	Node left, right;

	Node(int value) {
		key = value;
		left = null;
		right = null;
	}
}

public class SkewedTree {

	Node root = null;

	public Node node;
	static Node prevNode = null;
	static Node headNode = null;

	public Node convertToSkewedTree(Node root, int order) {

		if (root == null) {
			return null;
		}

		if (order > 0) {
			convertToSkewedTree(root.right, order);
		} else {
			convertToSkewedTree(root.left, order);
		}
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		if (order > 0) {
			convertToSkewedTree(root.left, order);
		} else {
			convertToSkewedTree(root.right, order);
		}
		return headNode;
	}

	public void traverseRightSkewedTree(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.key + " ");
		traverseRightSkewedTree(node.right);
	}

}
