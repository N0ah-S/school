public abstract class Knoten{
    
    public abstract DatenKnoten untenAnhängen(Element e);
    public abstract Knoten getNächster();
    public abstract Element getElement();
    public abstract int getGesamtgewicht();
    public abstract Knoten getKnoten(int i);
}