import java.util.Iterator;

public class QueueTest {
 
    public static void main() {
        
    	Queue<Frucht> qf = new Queue<>();
    	Queue<Gummib�rchen> qg = new Queue<>();
    	Queue<Schokolade> qs = new Queue<>();
    	
    	System.out.println("=== Fr�chte ===");
    	
    	qf.add(new Frucht("Pink"));
    	qf.add(new Frucht("Gr�n"));
    	qf.add(new Frucht("Blau"));
    	
    	for (int i = 0; i < qf.length; i++) {
			System.out.println("Frucht Nr. " + (i+1) + " hat die Farbe "+ qf.get(i).getFarbe());
		}
    	
    	qf.remove();
    	qf.remove();
    	System.out.println("Ist die Liste leer: " + qf.isEmpty());
    	
    	System.out.println("===============");
    	
    
    }
    
}