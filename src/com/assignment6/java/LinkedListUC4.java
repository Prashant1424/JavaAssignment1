package com.assignment6.java;

public class LinkedListUC4 extends LinkedList{

	public static void main(String[] args) {

		LinkedListUC4 linkedlist = new LinkedListUC4();
		
		linkedlist.addLast(30);
		linkedlist.display();
		linkedlist.addFirst(56);
		linkedlist.display();
		linkedlist.addLast(70);
		linkedlist.display();
		linkedlist.addLast(80);
		linkedlist.display();
		linkedlist.addLast(90);
		linkedlist.display();
		linkedlist.addInBtween(30, 70, 45);
		linkedlist.display();
		
	}


}
