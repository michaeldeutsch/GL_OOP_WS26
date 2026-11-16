# Übung 2 – Abstrakte Basisklasse (Geometrische Figuren)

**Thema:** Abstrakte Klassen (`abstract`), abstrakte Methoden und Vererbung

Erstelle eine abstrakte Basisklasse `Figur` im Package `einheit_05.uebung.uebung02` mit:
- Attribut `String farbe`
- Konstruktor zur Initialisierung der Farbe und Getter/Setter
- abstrakte Methode `public abstract double berechneFlaeche()`
- abstrakte Methode `public abstract double berechneUmfang()`
- Methode `toString()`, welche die Farbe und die berechneten Werte für Fläche und Umfang ausgibt.

Erstelle zwei Subklassen:
1. `Rechteck`: erbt von `Figur`, besitzt `double breite` und `double hoehe`, ruft `super(farbe)` auf und implementiert die beiden abstrakten Methoden.
2. `Kreis`: erbt von `Figur`, besitzt `double radius`, ruft `super(farbe)` auf und implementiert die beiden abstrakten Methoden (unter Nutzung von `Math.PI`).

Erstelle in `Main` Instanzen von `Rechteck` und `Kreis` und gib deren Informationen aus.

**Fertig, wenn:** Die abstrakte Basisklasse `Figur` nicht direkt instanziiert werden kann, die Subklassen die Methoden korrekt implementieren und die Flächen- sowie Umfangsberechnungen stimmen.
