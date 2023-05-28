package com.test.java;

public class TestingCode {
	
	Node head;
	
	class Node{
		Object data;
		Node ref;
		
		Node(Object data){
			this.data = data;	
		}
	}
	
	public void addLast(Object data) {

		Node newNode = new Node(data);
		
		if(head == null) 
			
			head = newNode;
		
		else if(head.ref == null)
		
			head.ref = newNode;
		
		else {
			Node temp = head;
			
			while(temp.ref != null) {
				temp = temp.ref;
			}
			
			temp.ref = newNode;
			
		}
	}
	
	public void addFirst(Object data) {
	
		Node newNode = new Node(data);
		
		if(head == null) 
			
			head = newNode;
		
		else {
			Node temp = newNode;
			
			temp.ref = head;
			
			head = temp;
			
		}
	}
	
	public void deleteFirst() {

		if(head == null) 
			
			System.out.println("There is no node to delete...");
		
		else {

			head = head.ref;

		}
	}
	
	public void deleteLast() {
		
		if (head == null)
		
			System.out.println("There is no node to delete...");
		
		else if (head.ref == null)
		
			head = head.ref;
		
		else {
		
			Node temp = head;
			
			while(temp.ref.ref != null) {
				
				temp = temp.ref;
		
			}
			
			temp.ref = null;
			
		}
	
	}
	
	public void display() {
		
		if(head == null)
		
			System.out.println("Linked List is empty, Please enter some node then try again.");
		
		else if(head.ref == null)
		
			System.out.println("There is only One node present who's data is : " + head.data);
		
		else {

			Node temp = head;
			
			while (temp != null) {
			
				if(temp.ref != null) {
				
					System.out.print(temp.data + " => ");
					
					temp = temp.ref;
				}else {
				
					System.out.print(temp.data + "\n");
					
					temp = temp.ref;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		TestingCode ll = new TestingCode();
		
//		ll.display();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.display();
		ll.deleteLast();
		ll.display();
		ll.addFirst(5);
		ll.display();
		ll.deleteFirst();
		ll.display();	
	}
}
