//adding some notes

package com.tmoodini.datastructures;

public class BalancedBinaryTree {
	TreeNode root;
	int key;
	
	BalancedBinaryTree(int key){
		this.root = new TreeNode(key);
	}
	
	BalancedBinaryTree(){
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
	
	public static void main(String[] args) {
		
		BalancedBinaryTree btree = new BalancedBinaryTree(1);
		btree.root.left = new TreeNode(2);
		btree.root.right = new TreeNode(3);
		
	}

}
