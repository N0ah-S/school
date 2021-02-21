public class DatenKnoten extends Knoten {
	
    Element zElement;
    Knoten zNaechster;
    
    public DatenKnoten(Element pE, AbschlussKnoten pNaechster){
        zElement = pE;
        zNaechster = pNaechster;
    }
    
    public DatenKnoten untenAnhaengen(Element e){
        zNaechster = zNaechster.untenAnhaengen(e);
        return this;
    }
    public Knoten getNaechster(){
        return zNaechster;
    }
    public Element getElement(){
        return zElement;
    }
    public int getGesamtgewicht(){
        return zNaechster.getGesamtgewicht() + zElement.getGewicht();
    }
    
    public Knoten getKnoten(int i){
        return i > 0 ? zNaechster.getKnoten(i-1) : this;
    }
}