package datastructures;

public class DsStack {
	
	public int size;
	public int stack[];
	public int index = -1;
	
	public DsStack() {
		this.size=50;
		this.stack = new int[this.size];
	}
	public DsStack(int size) {
		this .size=size;
		this.stack = new int[this.size];
	}
	
	public boolean pushStack(int item) {
		if(!isFull()) {
			this.index++;
			this.stack[this.index] = item;
			return true;
		}
		return false;
	}
	
	public int popStack() {
		if(!isEmpty()) {
			this.index--;
			return this.stack[this.index]; 
		}
		return -1;
	}
	
	public boolean isFull() {
		return (this.index>=this.stack.length);
	}

	public boolean isEmpty() {
		return (this.index<0);
	}

	public void printStack() {
		if(!this.isEmpty()) {
			for(int i=0; i<this.stack.length; i++) {
				System.out.println("Stack: "+i+" "+this.stack[i]);
			}
		}else {
			System.out.println("Stack is empty");
		}
	}
}
