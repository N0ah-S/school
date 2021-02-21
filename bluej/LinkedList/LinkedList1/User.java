
public class User {

        
        public static void primTest() {
                String[] els = new String[] {"Apfel", "Bannane", "Lollipop", "Granatapfel"};
            
		Liste liste = new Liste();
            
		for(int i = 1; i < 11; i++) {
		    logStatusInsert(i, liste, new Element(els[i % 4], (int) (Math.random() * 5500)), false);
		}
		for(int i = 1; i < 11; i++) {
		    logStatusInsert(-i, liste, null, true);
		}
        }
        
        public static void logStatusInsert(int schritt, Liste liste, Element e, boolean delete) {
            System.out.println();
            System.out.println("-- Schritt " + schritt + " -- ");
            if(delete) {
                liste.obenEntnehmen();
            } else {
                liste.untenAnhaengen(e);
            }
            liste.listeAusgeben();
            System.out.println();
        }
    
	public static void main(String[] args) {
		
		Liste liste = new Liste();
		Liste liste2 = new Liste();
		
		liste.untenAnhaengen(new Element("Apfel", 2000));		
		liste.untenAnhaengen(new Element("Banane", 1000));
		liste2.untenAnhaengen(new Element("Lollipop", 2050));
		liste2.untenAnhaengen(new Element("Apfel", 250));

		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");
		
		liste.obenEntnehmen();
		
		
		System.out.println();
		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");
		System.out.println();
		
		liste2.untenAnhaengen(new Element("Apfel", 850));
		
		liste.listeÜbernehmen(liste2);
		System.out.println();
		liste.listeAusgeben();
		System.out.println(liste.getGesamtgewicht() + "g");

	}

}
