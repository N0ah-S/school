
public class User {

	public static void primTest() {
//		Liste liste = new Liste();
//            
//		Math.random() * 3
        }
        
        
	
	public static void main(String[] args) {
		
		Liste liste = new Liste();
		
		liste.untenAnhängen(new Element("Apfel", 2000));		
		liste.untenAnhängen(new Element("Banane", 1000));
		liste.untenAnhängen(new Element("Lollipop", 2050));
		liste.untenAnhängen(new Element("Apfel", 250));

		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");
		
		liste.obenEntnehmen();
		
		
		System.out.println();
		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");
		System.out.println();
		
		liste.obenEntnehmen();
		liste.untenAnhängen(new Element("Apfel", 250));
		
		System.out.println();
		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");

	}

}
