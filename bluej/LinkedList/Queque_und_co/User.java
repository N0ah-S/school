
public class User {
    
    public static Stack<Ziffer> stack;
    
    public static void zifferTest() {
        stack = new Stack<Ziffer>();
        
        push(Ziffer.Neun);
        push(Ziffer.Sechs);
        push(Ziffer.Fünf);
        
        peek();
        pop();
        peek();
        pop();
        peek();
        pop();
        peek();
        System.out.println("Ist die Liste leer: " + stack.isEmpty());
    }
    
    public static void push(Ziffer z) {
        stack.push(z);
        System.out.println(z + " hinzugefügt");
    }
    
    public static void peek() {
        System.out.println(stack.peek() + " ist an oberster Stelle");
    }
    
    public static void pop() {
        stack.pop();
        System.out.println("Element entfernt");
    }

}