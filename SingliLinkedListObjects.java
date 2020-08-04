
public class SingliLinkedListObjects {
	Node head; // basic structure of the list
	public SingliLinkedListObjects(Student newEntry){
		head = new Node();
		head.std = newEntry;
		head.link = null;
	}
	public void addSingliLinkedListObjectsBeforeHead(Student newEntry){
		Node n = new Node();
		n.std = newEntry;
		n.link = head;
		head = n;
	}
	public void addSingliLinkedListObjectsAfter(Student newEntry){
		Node n = new Node();
		Node curr = head;
		while(true){
			if(curr.link == null){
				n.std = newEntry;
				n.link = null;
				curr.link = n;
				break;
			}
			curr = curr.link;
		}
	}
	public void deleteSingliLinkedListObjects(String toBeDeleted){
		Node prev = head;
		Node curr = head.link;
		
		while(true){
			if(curr.link == null || curr.std.Name == toBeDeleted){
				break;
			}
			prev = curr;
			curr = curr.link;
		}
		if(curr.link != null){
			prev.link = curr.link; 
		}
	}
	public void displaySingliLinkedListObjects(){
		Node curr = head;
		while(curr !=null){
			System.out.println(curr.std.displayStudent());
			curr = curr.link;
		}
	}
	class Node{
	Student std;
	Node link;
	}
}
