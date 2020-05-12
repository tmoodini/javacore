//adding some notes

package com.tmoodini.datastructures;

public class BinaryTree {
	TreeNode root;
	
	BinaryTree(int data){
		this.root = new TreeNode(data);
	}
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int data;
		TreeNode(int data){
			this.data = data;
		}
		
	}
	
	public static void main(String[] args) {
		
		BinaryTree btree = new BinaryTree(1);
		btree.root.left = new TreeNode(2);
		btree.root.right = new TreeNode(3);
		
	}

}
