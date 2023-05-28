package com.assignment6.java;

public class LinkedListUC7 extends LinkedList{

	public static void main(String[] args) {

		LinkedListUC7 linkedlist = new LinkedListUC7();

		linkedlist.addFirst(70);
		linkedlist.display();
		linkedlist.addFirst(30);
		linkedlist.display();
		linkedlist.addFirst(56);
		linkedlist.display();
		
		System.out.println(" ");
		
		linkedlist.searchNode(30);
		linkedlist.searchNode(45);
		
		
	}


}
