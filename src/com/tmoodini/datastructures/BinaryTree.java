//adding some notes

package com.tmoodini.datastructures;

public class BinaryTree {
	TreeNode root;
	int key;
	
	BinaryTree(int key){
		this.root = new TreeNode(key);
	}
	
	BinaryTree(){
		this.root = null;
	}
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int key;
		
		TreeNode(int key){
			this.key = key;
			
			left = right = null;
		}
		
	}
	
	public int height(BinaryTree tree) {
		
		TreeNode currentNode = tree.root;
		int leftHeight = 0;
		int rightHeight = 0;
		while(currentNode.left != null) {
			
			leftHeight += 1;
			currentNode = currentNode.left;
			
		}
		currentNode = tree.root;
		while(currentNode.right != null) {
			rightHeight += 1;
			currentNode = currentNode.right;
		}
		
		if(leftHeight >= rightHeight) {
			return leftHeight;
		}
		else {
			return rightHeight;
		}
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree btree = new BinaryTree(1);
		btree.root.left = new TreeNode(2);
		btree.root.right = new TreeNode(3);
		btree.root.right.right = new TreeNode(5);
		btree.root.left.left = new TreeNode(-9);
		btree.root.left.left.left = new TreeNode(-6);
		
		System.out.println(btree.height(btree));
		
	}

}
