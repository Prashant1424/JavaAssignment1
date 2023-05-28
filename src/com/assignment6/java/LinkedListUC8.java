package com.assignment6.java;

public class LinkedListUC8  extends LinkedList{

	public static void main(String[] args) {

		LinkedListUC8 linkedlist = new LinkedListUC8();
		
		linkedlist.addLast(30);
		linkedlist.display();
		linkedlist.addFirst(56);
		linkedlist.display();
		linkedlist.addLast(70);
		linkedlist.display();
		System.out.println("");
		linkedlist.addInBtween(30, 70, 40);
		linkedlist.display();
		
		
	}

}
