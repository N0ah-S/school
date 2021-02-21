public class Element{
    String zObst;
    int zGewicht;
    
    public Element(String pObst, int pGewicht){
        zObst = pObst;
        zGewicht = pGewicht;
    }
    
    public int getGewicht(){
    	return zGewicht;
    }
    
    public String getObst(){
    	return zObst;
    }
}