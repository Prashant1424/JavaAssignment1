package com.assignment6.java;

public class LinkedListUC5 extends LinkedList{

	public static void main(String[] args) {

		LinkedListUC5 linkedlist = new LinkedListUC5();

		linkedlist.addFirst(70);
		linkedlist.display();
		linkedlist.addFirst(30);
		linkedlist.display();
		linkedlist.addFirst(56);
		linkedlist.display();
		
		System.out.println(" ");
		
		linkedlist.deleteFirst();
		linkedlist.display();
		
	}


}
