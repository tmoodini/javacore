package com.tmoodini.datastructures;

public class LinkedList {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		
		llist.head = new Node(1);
		Node second = new Node(3);
		llist.head.next = second;
		Node third = new Node(8);
		second.next = third;
		Node fourth = new Node(5);
		third.next = fourth;
		
		llist.printList();
		

	}
	
	Node head;
	
	public static class Node{
		
		int value;
		Node next;
		
		Node(int value){
			this.value = value;
			next = null;
		}
	}//end Node
	
	public void printList() {
		Node n = head;
		
		while( n != null) {
			System.out.print(n.value + ", ");
			n = n.next;
		}
		
	}

}
