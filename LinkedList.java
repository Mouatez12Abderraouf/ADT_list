package Abstract_List;

public class LinkedList<T> extends List<T>{

	node<T> head;
	
	public LinkedList() {
		this.head = null;
	}
	
	@Override
	public List emptyList() {
		return null;
	}

	@Override
	public List insert(List L, int p, T e) {
		LinkedList L1 = (LinkedList) L;
		node<T> newNode = new node<T>(e);
		if(p == 1) {
			newNode.next = L1.head;
			L1.head = newNode;
			return L1;
		}
		node<T> pt = L1.head;
		for(int i = 1;i < p - 1;i++) {
			pt = pt.next;
		}
		newNode.next = pt.next;
		pt.next = newNode;
		
		return L1;
	}

	@Override
	public List delete(List L, int p) {
		LinkedList L1 = (LinkedList) L;
		if(p == 1) {
			L1.head = L1.head.next;
			return L1;
		}
		node<T> pt = L1.head;
		for(int i = 1; i < p - 1;i++) {
			pt = pt.next;
		}
		pt.next = pt.next.next;
		return L1;
	}

	@Override
	public T access(List L, int p) {
		LinkedList L1 = (LinkedList) L;
		node<T> pt = L1.head;
		for(int i = 1;i < p;i++) {
			pt = pt.next;
		}
		
		return pt.info;
	}

	@Override
	public boolean isEmpty(List L) {
		LinkedList L1 = (LinkedList) L;
		return L1.head == null;
	}

	@Override
	public int length(List L) {
		LinkedList L1 = (LinkedList) L;
		int Co = 0;
		node pt = L1.head;
		while(pt != null) {
			pt = pt.next;
			Co++;
		}
		return Co;
	}

}
