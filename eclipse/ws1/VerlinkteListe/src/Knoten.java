public abstract class Knoten{
    
    public abstract DatenKnoten untenAnh�ngen(Element e);
    public abstract Knoten getN�chster();
    public abstract Element getElement();
    public abstract int getGesamtgewicht();
    public abstract Knoten getKnoten(int i);
}