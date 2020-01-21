package com.DSA.LinkedList;

public class LinkedList <T>{
	//inned class
	protected class Node<T>{
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
			//this.next will takes null as default value
			this.next = null;
		}
	}
	
	private Node head;
	public LinkedList(){
		head = new Node<T>(null);
	}
	

	
	public void addNode(T data) {
		Node new_node = new Node<T>(data);
		//insert for the first time		
		if (head.next == null) {// if we are in the first add
			head.next = new_node;			
		}else {// if the next is not null we should traverse until node.next == null
			Node last = head.next;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;			
		}			
	}
	
	public void printLinkedList() {
		if(head.next == null) {
			System.out.println("The linked list is empty ! ");
		} else {// linked list is not Empty there's at least one item
			int count = 0;
			Node newnode = head;
			do {
				System.out.println("The " + count +" th item equals : "+ newnode.data);
				newnode = newnode.next;
				count +=1;				
			}while(newnode.next != null);
				
			//print last one 
			if (newnode.next == null && newnode.data != null)
					System.out.println("The " + count +" th item equals : "+ newnode.data);
		}
	}
	
	public void delete() {
		if (head.next == null) {
				System.out.println("The linked list empty ! ");
		} else {
			head = head.next;
		} 
	}
	
}
