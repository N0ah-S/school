public class AbschlussKnoten extends Knoten {
	
    public DatenKnoten untenAnh�ngen(Element pE){
        return new DatenKnoten(pE, this);
    }
    public Knoten getN�chster(){
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