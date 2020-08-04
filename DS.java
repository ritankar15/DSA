package dsandalg;
//main function
import datastructures.SinglyLinkedList;

public class DS {

	public static void main(String[] args) {
		SinglyLinkedList s = new SinglyLinkedList(2);
		s.addSinglyLinkedListRear(4);
		s.addSinglyLinkedListRear(6);
		s.addSinglyLinkedListRear(8);
		s.addSinglyLinkedListRear(10);
		s.addSinglyLinkedListRear(12);
		s.addSinglyLinkedListRear(14);
		s.displaySinglyLinkedList();
		s.replaceElementSinglyLinkedList(4, 3);
		s.displaySinglyLinkedList();
	}

}
