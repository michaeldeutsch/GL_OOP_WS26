# Übung 4 – Final-Methoden und Final-Klassen (Bankensystem)

**Thema:** Unveränderlichkeit und Vererbungskontrolle mit `final`

Erstelle eine abstrakte Klasse `Konto` im Package `einheit_05.uebung.uebung04` mit:
- `String iban`
- `double kontostand`
- Konstruktor, Getter und Setter für `kontostand`
- einer **finalen** Methode `public final void druckeKopfzeile()`: gibt einheitlich `"=== OFFIZIELLER KONTOAUSZUG: " + iban + " ==="` aus. Subklassen dürfen diese Methode nicht überschreiben!
- einer abstrakten Methode `public abstract void bucheZinsen()`

Erstelle zwei Subklassen:
1. `Girokonto`: erbt von `Konto`, hat `double disporahmen`, implementiert `bucheZinsen()` (z. B. `-0.0` bei positivem Saldo bzw. Sollzinsen bei Überziehung).
2. `Sparkonto`: **final class** (keine weitere Vererbung möglich), hat `double zinssatz` (z. B. `0.025` für 2.5%), implementiert `bucheZinsen()` (erhöht den Kontostand um `kontostand * zinssatz`).

Erstelle in `Main` Instanzen beider Kontotypen, führe Einzahlungen/Zinsbuchungen durch, rufe die finale Methode `druckeKopfzeile()` auf und gib die Kontostände aus.

**Fertig, wenn:** Die `final`-Modifikatoren an Methode und Klasse wie gefordert gesetzt sind und Zinsberechnungen sowie Auszüge fehlerfrei arbeiten.
