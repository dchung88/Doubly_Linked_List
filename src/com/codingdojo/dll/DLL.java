package com.codingdojo.dll;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void push(Node newNode) {
		if(this.head == null) {
			this.head = newNode;
			this.tail = newNode;
			return;
		}
		Node lastNode = this.tail;
		lastNode.next = newNode;
		newNode.previous = lastNode;
		this.tail = newNode;
	}
	
	public void printValuesBackward() {
		Node current = this.tail;
		while(current != null) {
			System.out.println(current.value);
			current = current.previous;
		}
	}
	
	public Node pop() {
		if(this.tail == null) {
			System.out.println("There are no nodes in this list");
		}
		Node lastNode = this.tail;
		this.tail = lastNode.previous;
		System.out.println(lastNode.value + " has been popped");
		return lastNode;
	}
	
	public boolean contains(Integer value) {
		if(this.head == null) {
			System.out.println("There are no nodes in this list");
		}
		
		Node runner = this.head;
		while(runner != null) {
			if(runner.value == value) {
				System.out.println("True");
				return true;
			}
			runner = runner.next;
		}
		System.out.println("False");
		return false;
	}
	
	public int size() {
		int count = 0;
		Node runner = this.head;
		
		while(runner != null) {
			count ++;
			runner = runner.next;
		}
		System.out.println("Number of nodes: " + count);
		return count;
		
	}
	
}
