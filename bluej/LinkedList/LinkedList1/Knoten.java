public abstract class Knoten{
    
    public abstract DatenKnoten untenAnhaengen(Element e);
    public abstract Knoten getNaechster();
    public abstract Element getElement();
    public abstract int getGesamtgewicht();
    public abstract Knoten getKnoten(int i);
}