package com.assignment6.java;

public class LinkedListUC6 extends LinkedList{

	public static void main(String[] args) {

		LinkedListUC6 linkedlist = new LinkedListUC6();
		
		linkedlist.addFirst(70);
		linkedlist.display();
		linkedlist.addFirst(30);
		linkedlist.display();
		linkedlist.addFirst(56);
		linkedlist.display();
		
		System.out.println(" ");
		
		linkedlist.deleteLast();
		linkedlist.display();

		
	}


}
