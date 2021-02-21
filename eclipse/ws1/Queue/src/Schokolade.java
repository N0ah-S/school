public class Schokolade {
    String sorte;
    int anzahl;
    
    public Schokolade(String sorte, int anzahl) {
        this.anzahl = anzahl;
        this.sorte = sorte;
    }
    
    public String getSorte() {
        return sorte;
    }
    
    public int getAnzahl() {
        return anzahl;
    }
}