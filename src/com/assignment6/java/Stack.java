package com.assignment6.java;

public class Stack {

	Node head;
	
	class Node{
		
		Object data;
		
		Node ref;
		
		Node(Object data){
			
			this.data = data;
			
		}		
	
	}

	public void push(Object data) {
		
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

	public void pop() {
	
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
		
			System.out.println("There is no Node to display inside the Stack...");
	
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

	public static void main(String[] args) {
		
		Stack obj = new Stack();
		
		obj.push(70);
		obj.display();
		obj.push(30);
		obj.display();
		obj.push(56);
		obj.display();
		obj.pop();
		obj.display();
		obj.pop();
		obj.display();
		obj.pop();
		obj.display();

	}

}
