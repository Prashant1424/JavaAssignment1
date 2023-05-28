package com.test.java;

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
		
		if(head == null) {
			head = newNode;
		}else if(head.ref == null)
			head.ref = newNode;
		else {
			Node temp = head;
			
			while(temp.ref != null) {
				temp = temp.ref;
			}
			
			temp = newNode;
			
		}
	}
	
	public void display() {
		if(head == null)
			System.out.println("Linked List is empty, Please enter some node then try again.");
		else if(head.ref == null)
			System.out.println("There is only One node present who's data is : " + head.data);
		else {
			Node temp = head;
			
			while (temp.ref != null) {
				System.out.println(temp.data);
				temp = temp.ref;
			}
		}
	}
	

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.display();
		
	}

}
