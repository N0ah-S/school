public class AbschlussKnoten extends Knoten {
	
    public DatenKnoten untenAnhängen(Element pE){
        return new DatenKnoten(pE, this);
    }
    public Knoten getNächster(){
        return null;
    }
    public Element getElement(){
        return null;
    }
    
    public int getGesamtgewicht(){
    	return 0;
    }
    
    public Knoten getKnoten(int i){
        return null;
    }
}