# Übung 9 – E-Commerce Rabatt-System mit Lombok & Polymorphismus

**Thema:** Abstrakte Klassen, Lombok `@Data`, Vererbungshierarchien und Rabattberechnungen

Erstelle eine abstrakte Klasse `RabattAktion` im Package `einheit_05.uebung.uebung09` mit:
- `String aktionsName`
- `String beschreibung`
- Konstruktor, Getter, Setter und `toString()`
- abstrakte Methode `public abstract double wendeRabattAn(double urspruenglicherPreis, int anzahl)`

Erstelle drei konkrete Subklassen unter Nutzung von Lombok:
1. `ProzentRabatt`: hat `double prozentSatz` (z. B. `15.0` für 15%). Zieht den Prozentsatz vom Gesamtpreis (`preis * anzahl`) ab.
2. `FixerRabatt`: hat `double rabattBetrag` (z. B. `10.0` Euro). Zieht den Fixbetrag einmalig vom Gesamtpreis ab (der Endpreis darf nicht unter 0 fallen).
3. `MengenRabatt`: hat `int mindestMenge` und `double prozentSatz`. Wenn `anzahl >= mindestMenge`, wird der Prozentsatz abgezogen, sonst kein Rabatt.

Erstelle eine Klasse `Warenkorb`:
- `double artikelPreis`
- `int anzahl`
- `ArrayList<RabattAktion> verfuegbareAktionen`
- `addAktion(RabattAktion aktion)`
- `findeBesterEndpreis()`: iteriert über alle Aktionen, ermittelt den günstigsten Endpreis und gibt die beste Aktion sowie den Endpreis zurück.

Erstelle in `Main` einen Warenkorb und teste die Rabattaktionen mit verschiedenen Mengen und Preisen.

**Fertig, wenn:** Alle Rabattstrategien polymorph berechnet werden und der optimale Preis zuverlässig bestimmt wird.
