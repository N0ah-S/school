public class Liste {
	
    private int zAnzahlKnoten = 0;
    private Knoten zErster;
    
    public Liste(){
        zErster = new AbschlussKnoten();
    }
    
    public Knoten getErster(){
    	return zErster;
    }
    public int getAnzahlKnoten(){
    	return zAnzahlKnoten;
    }
    public void untenAnhaengen(Element pE){
        zErster = zErster.untenAnhaengen(pE);
        zAnzahlKnoten++;
    }
    public void listeÜbernehmen(Liste liste){
        while(liste.getAnzahlKnoten() > 0) {
            zErster = zErster.untenAnhaengen(liste.getErster().getElement());
            liste.obenEntnehmen();
            zAnzahlKnoten++;
        }
    }
    public int getGesamtgewicht(){
        return zErster.getGesamtgewicht();
    }
    public void obenEntnehmen(){
        if(zAnzahlKnoten > 0){
            zErster = zErster.getNaechster();
            zAnzahlKnoten--;
        }
    }
    public Knoten getKnoten(int i){
        return i<=zAnzahlKnoten-1 ? zErster.getKnoten(i) : null;
    }
    public void listeAusgeben(){
        Knoten k = zErster;
        for(int i = 0; i<zAnzahlKnoten; i++){
            System.out.println(k.getElement().getGewicht() + "g " + k.getElement().getObst());
            k = k.getNaechster();
        }
    }
}