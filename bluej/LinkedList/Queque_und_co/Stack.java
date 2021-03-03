
public class Stack<T> {

	private Node top;
	
	
	public Stack() {}
	
	public void push(T element) {
		top = new Node(top, element);
	}
	
	public void pop() { //T
		if(top != null) {
			T e = top.element;
			top = top.next;
			//return e;	
		}
		//return null;
	}
	
	public T peek() {
		return top == null ? null : top.element;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	class Node {
		
		Node next;
		T element;
		
		public Node(Node next, T element) {
			this.next = next;
			this.element = element;
		}
		
	}
}
