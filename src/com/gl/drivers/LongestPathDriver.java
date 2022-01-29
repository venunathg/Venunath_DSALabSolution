package com.gl.drivers;

import java.util.ArrayList;
import java.util.Collections;




public class LongestPathDriver {

	public static void main(String[] args) {
		Node root = new Node(100);
		Node right = new Node(130);
		Node left = new Node(20);
		root.left = left;
		root.right = right;
		left.left = new Node(10);
		left.right = new Node(50);
		right.left = new Node(110);
		right.right = new Node(140);
		left.left.left = new Node(5);
		
		ArrayList<Integer> longestPath = findLongestPath(root);
		Collections.reverse(longestPath);
		
		for (int each : longestPath) {       
		    System.out.print(each);
		    System.out.print("->");
		}
		

	}



	public static ArrayList<Integer> findLongestPath(Node root) {

		if (root == null) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			return output; 
		}


		ArrayList<Integer> rightNode = findLongestPath(root.right);
		

				ArrayList<Integer> leftNode = findLongestPath(root.left);


		if (rightNode.size() < leftNode.size()) {
			leftNode.add(root.data);
		} else {
			rightNode.add(root.data);
		}


		return leftNode.size() > rightNode.size() ? leftNode : rightNode;

	}

}


class Node {

	public Node left;
	public Node right;
	public int data;


	Node(int data) {
		this.data = data;
	}

}