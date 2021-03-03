
public class Frucht {

	String farbe;
	
	public Frucht(String farbe) {
		this.farbe = farbe;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	
	///Ja, äh... ne is eine Methode von Object die ich überschreibe
	public String toString() {
		return "Frucht:" + farbe;
	}
	
}
