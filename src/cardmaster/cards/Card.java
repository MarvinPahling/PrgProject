package cardmaster.cards;

import cardmaster.Shape;

/**
 * <h1>Punkte</h1> 0.5 Punkte für jeden nicht leeren Ablagestapel und 0.5 Punkte
 * für jede einzigartige Form.
 * <p>
 * Beispiele:
 * 
 * <pre>
 *   -
 *   - Stern < gelegt
 *   -
 * </pre>
 * 
 * 0.5 für nicht leere Stapel + 0.5 für die Form Stern
 * 
 * <pre>
 * -Kreis - Stern < gelegt - Kreis
 * </pre>
 * 
 * 1.5 für nicht leere Stapel + 1.0 für die Formen Kreis und Stern.
 */
public class Card {

	public Card(Shape shape) {
	}

	/**
	 * Gibt die Form der Karte zurück.
	 */
	public Shape getShape() {
		return null; // TODO
	}

	/**
	 * Gibt den Namen der Karte zurück. z.B.: Chance
	 */
	public String getName() {
		return null; // TODO
	}
}
