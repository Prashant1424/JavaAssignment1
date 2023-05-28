package com.assignment6.java;

public class LinkedListUC9 extends LinkedList {

	public static void main(String[] args) {
		
		LinkedListUC9 linkedlist = new LinkedListUC9();


		linkedlist.addLast(56);
		linkedlist.display();
		linkedlist.addLast(30);
		linkedlist.display();
		linkedlist.addLast(70);
		linkedlist.display();
		linkedlist.addLast(80);
		linkedlist.display();
		linkedlist.addLast(90);
		linkedlist.display();
		linkedlist.deleteInBetween(30);
		linkedlist.display();

	
	}

}
