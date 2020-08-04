package datastructures;

public class DsQueue {
	public int size;
	public int queue[];
	public int total;
	public int first;
	public int last;

	public DsQueue() {
		this.queue = new int[50];
		this.total = 0;
		this.first = 0;
		this.last = 0;
	}
	
	public DsQueue(int size) {
		this.queue = new int[size];
		this.total = 0;
		this.first = 0;
		this.last = 0;
	}

	public boolean enQueue(int item) {
		this.total++;
		this.queue[this.first] = item;
		this.first++;
		return true;
	}
	
	public int deQueue() {
		int item = this.queue[this.last];
		this.last ++;
		this.total --;
		return item;
		
	}
	
	public boolean isEmpty() {
		return (this.total == 0);
	}
	
	public boolean isFull() {
		return (this.total == this.size);
	}
}
