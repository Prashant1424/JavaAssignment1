package com.assignment6.java;

public class LinkedList {

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
		
		if( head == null)
			
			head = newNode;
		
		else if ( head.ref == null)
			
			head.ref = newNode;
		
		else {
			
			Node temp = head;
			
			while( temp.ref != null ) {
				
				temp = temp.ref;
				
			}
			
			temp.ref = newNode;
			
		}
		
	}
	
	public void addInBtween(Object data1, Object data2, Object data3 ) {
		
		Node d1 = new Node(data1);
		
		Node d2 = new Node(data2);
		
		Node newNode = new Node(data3);
		
		Node temp = head;
	
		Node temp2 = head.ref;
		
		while(temp != null) {
			
			if (temp.data == d1.data && temp.ref.data == d2.data) {
				
			
				temp.ref = newNode;
				
				newNode.ref = temp2;
				
				break;
						
			}
			
			temp = temp.ref;
	
			temp2 = temp2.ref;
		
		}
	
	}
	
	public void addFirst(Object data) {
		
			Node newNode = new Node(data);
		
			if( head == null)
			
				head = newNode;
		
			else {
			
				Node temp = newNode;
						
				temp.ref = head;
				
				head = temp;
			
			}
		
	}
	
	public void deleteFirst() {
		
		if ( head == null )
			
			System.out.println("There is no Node to delete, Please insert some Node inside Linked List first and Try again...");
		
		else {
			
			head = head.ref;
			
		}
	
	}
	
	public void deleteLast() {
		
		if ( head == null )
			
			System.out.println("There is no Node to delete, Please insert some Node inside Linked List first and Try again...");
		
		else if ( head.ref == null)
			
			head = null;
		
		else {
			
			Node temp = head;
			
			while ( temp.ref.ref != null) {
				
				temp = temp.ref;
				
			}
			
			temp.ref = null;
		
		}
	
	}
		
	public void display() {
		
		if ( head == null)
			
			System.out.println("There is no Node to display inside the Linked List...");
		
		else {
			
			Node temp = head;
			
			while( temp != null) {
				
				if ( temp.ref != null) {
					
					System.out.print(temp.data + " => ");
					
					temp = temp.ref;
					
				}
				else {
					
					System.out.print(temp.data + "\n");

					temp = temp.ref;
				
				}			
			}
			
		}
			
	}
	
	public void deleteInBetween(Object data) {
		
		Node newNode = new Node(data);
		
		Node temp = head;
		
		while ( temp != null) {
			
			if ( temp.ref.data == newNode.data ) {
				
				temp.ref = temp.ref.ref;
			
				break;
				
			}
		
			temp = temp.ref;
			
		}
		
	}
	
	public void searchNode(Object data) {
		
		Node newNode = new Node(data);
		

		int count = 0;
		
		int c =0;
		
		Node temp = head;
		
		while (temp != null) {
			
			count++;
			
			if ( temp.data == newNode.data) { 
			
				c = count;
				
				break;
			
			}
			
			temp = temp.ref;
			
		}
		
		if (c == count)	
			
			System.out.println( newNode.data +" is present at Node " + c +".");
	
		else
		
			System.out.println("Please enter a valid number");
		
				
	}
	
}
