
public class Stack<T> {

	private Node top;
	
	public void push(T element) {
		top = new Node(top, element);
	}
	
	public T pop() {
		if(top != null) {
			T e = top.element;
			top = top.next;
			return e;	
		}
		return null;
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
