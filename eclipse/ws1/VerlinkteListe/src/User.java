
public class User {

	public static void primTest() {
//		Liste liste = new Liste();
//            
//		Math.random() * 3
        }
        
        
	
	public static void main(String[] args) {
		
		Liste liste = new Liste();
		
		liste.untenAnh�ngen(new Element("Apfel", 2000));		
		liste.untenAnh�ngen(new Element("Banane", 1000));
		liste.untenAnh�ngen(new Element("Lollipop", 2050));
		liste.untenAnh�ngen(new Element("Apfel", 250));

		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");
		
		liste.obenEntnehmen();
		
		
		System.out.println();
		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");
		System.out.println();
		
		liste.obenEntnehmen();
		liste.untenAnh�ngen(new Element("Apfel", 250));
		
		System.out.println();
		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");

	}

}
