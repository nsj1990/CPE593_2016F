public class DoubleLinkedList {
	private static class Node { // LinkedList.Node
    int val;
		Node next;
		Node prev;
	}
	
	private Node head;
	public DoubleLinkedList() {


	}


	public void addEnd(int v) {

		
	}
	public void insert(int i, int v) {


	}
	
	public void removeEnd() {


	}
	public void removeStart() {




	}


	public String toString() {





	}

	public int size() {



	}

	public int get(int i) {



	}

	public static void main(String[]args) {
		LinkedList2 a = new LinkedList2();
		for (int i = 0; i < 10; i++)
			a.addStart(i);
		System.out.println(a);
		for (int i = 0; i < 10; i++)
			a.addEnd(i);
		System.out.println(a);
		
			
	}
}	
