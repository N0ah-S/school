
public class User {

	public static void main() {
		Queue q1 = new Queue();
		
		q1.add(1);
		q1.add(2);
		q1.add(3);
		
		System.out.println("Erstes Element: " + q1.first());
		
		q1.remove();
		
		System.out.println("Erstes Element: " + q1.first());
		
		System.out.println("Ist die Liste leer: " + q1.isEmpty());
		
		Stack<Ziffer> stack = new Stack<Ziffer>();
        
        stack.push(Ziffer.Neun);
	}
	
}
