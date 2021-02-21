
/**
 * 
 * @author Noah S
 *
 * Einfaches Beispiel für generische Klassen
 *
 * @param <T> Typ für erstes Argument
 * @param <R> Typ für zweites Argument
 */

public class Pair<T, R> {

	private T a;
	private R b;
	
	public Pair(T a, R b) {
		this.a = a;
		this.b = b;
	}

	public void setA(T a) {
		this.a = a;
	}

	public void setB(R b) {
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public R getB() {
		return b;
	}
	
}
