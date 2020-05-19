//adding some notes

package com.tmoodini.datastructures;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BalancedBinaryTree {
	TreeNode root;
	int key;
	
	BalancedBinaryTree(int key){
		this.root = new TreeNode(key);
	}
	
	BalancedBinaryTree(){
		this.root = null;
	}
	
	public int getHeight() {
		if(this.root == null) {
			return 0;
		}
		else {
			return root.getHeight();
		}
		
	}
	
	public static class TreeNode{
		TreeNode left;
		TreeNode right;
		int key;
		
		TreeNode(int key){
			this.key = key;
			
			left = right = null;
		}
		
		public int getHeight()
		{
			int leftHeight = 0; 
			int rightHeight = 0;
			
			if(this.left != null) {
				leftHeight = left.getHeight();
			}
			
			if(this.right != null) {
				rightHeight = right.getHeight();
			}
			
			//returns 1 (for the current node) plus the greater of right or left
			return 1+ Math.max(leftHeight, rightHeight);
		}
		
	}
	
	public void insert(TreeNode treeNode, TreeNode currentNode) {
		
		
		if(this.root == null) {
			this.root = treeNode;
			return;
		}
		
		if(treeNode.key <= currentNode.key) {
			if(currentNode.left == null) {
				currentNode.left = treeNode;
			}
			else {
				insert(treeNode, currentNode.left);
			}
			
		}
		
		if(treeNode.key > currentNode.key) {
			if(currentNode.right == null) {
				currentNode.right = treeNode;
			}
			else {
				insert(treeNode, currentNode.right);
			}
			
		}
		
	
	}
	

	
	
	
	public static void main(String[] args) {
		
		BufferedReader reader;
		//System.out.println("Working Directory = " + System.getProperty("user.dir"));
		BalancedBinaryTree btree = new BalancedBinaryTree();
		try {
			reader = new BufferedReader(new FileReader(
					"./testdata/treedatafile.txt"));
			String line = reader.readLine();
			
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
				
				if(line != null) {
				
				TreeNode node = new TreeNode(Integer.parseInt(line));
				btree.insert(node, btree.root);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("height = " + btree.getHeight());
		//btree.root.left = new TreeNode(2);
		//btree.root.right = new TreeNode(3);
		
	}

}
