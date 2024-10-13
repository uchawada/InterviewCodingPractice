package chasePractice;

import java.util.LinkedList;

public class ReverseLinkedList {

	static Node head;
	
	static class Node{
		int data; 
		Node next; 
	
		Node(int d) {
			data = d;
			next = null;
		}
	}
	void printList(Node node){
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}
	Node reverse(Node node){
		return node;
		
	}

	public static void main(String[] args){
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		
		System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
	}
}






