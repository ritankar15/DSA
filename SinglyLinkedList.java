package datastructures;

public class SinglyLinkedList {
	
//property to represent a node of a singly linked list, formed with value and address fields.
//an inner class is used as the usage of Node class is limited to it's outer class
//recursive usage of the class 
	Node head;
	public class Node{
		public int item;
		public Node link;
	}
//Constructer, to start the list with considering no next element at this point
//the value us passed in the form of a parameter.	
	public SinglyLinkedList(int element) {
		head = new Node();
		head.item  = element;
		head.link = null;
	}
//Method to add an element to the list behind, i.e. LHS of the Head/cursor
//the value us passed in the form of a parameter.
	public void addSinglyLinkedListRear(int element) {
		Node n = new Node();
		n.item = element;
		n.link = head; // new element stores the address of the head to be added behind the head.
		head = n; // head is provided with the current address of the new element.
	}
//Method to add the new element after, i.e. RHS of the last node of the list. 
	public void addSinglyLinkedListFront(int element) {
		Node n = new Node(); // to add the new element
		Node curr = head;    
		Node nxt = curr.link; 
		while(true) {// this will iterate till nxt becomes null, which ideally means the end of the list
			if(nxt == null) {
				n.item = element;
				n.link = null;// front added item of a singly linked list is always the last element, should contain the next address as null
				nxt.link = n;// assigning the address of newly added element to it's previous element's link.
				break; // we do not need the further iteration as the value added in the end of the list as the last element.
			}
			curr = nxt;
			nxt = nxt.link;
		}
	}
//this method searches a given element and replaces the first occurrence of this in the linked list 
//this method yet needs modification in order to check all the occurrences and replace them
	public void replaceElementSinglyLinkedList(int element, int newElement) {
		Node curr = head;
		Node nxt = head.link;
		while(true) {
			if(nxt == null || nxt.item == element) {
				nxt.item = newElement;// replacing the element with the new element
				break;
			}
			curr = nxt;
			nxt = nxt.link;
		}
	}
//this method will release the mentioned element from the list by updating the reference if this elements previous node
//this method yet needs modification in order to check all the occurrences of the given element and release them
	public void deleteElementSinglyLinkedList(int element) {
		Node curr = head;
		Node nxt = head.link;
		while(true) {
			if(nxt == null || nxt.item == element) {
				break;
			}
			curr = nxt;
			nxt = nxt.link;
		}
		if(nxt != null) { // will only be true when the value to delete is found
			curr.link = nxt.link;
		}
	}
	public void displaySinglyLinkedList() {
		Node n = head;
		while(n!=null) {
			System.out.println(n.item);
			n = n.link;
		}
	}
}
