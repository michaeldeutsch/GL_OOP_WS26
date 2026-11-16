# Übung 6 – Abstrakte Mitarbeiter-Hierarchie mit Gehaltsberechnung

**Thema:** Abstrakte Klassen, Vererbung, Lombok und polymorphe Gehaltsabrechnung

Erstelle eine abstrakte Klasse `Angestellter` im Package `einheit_05.uebung.uebung06` mit:
- `int id`
- `String name`
- `LocalDate geburtsdatum`
- Konstruktor, Getter, Setter und `toString()` (bzw. Lombok `@Getter`, `@Setter`, `@ToString`)
- abstrakte Methode `public abstract double berechneMonatsgehalt()`

Erstelle drei konkrete Subklassen:
1. `Festangestellter`: hat `double monatsGrundgehalt`. Monatsgehalt = `monatsGrundgehalt`.
2. `Freiberufler`: hat `double stundensatz` und `int geleisteteStunden`. Monatsgehalt = `stundensatz * geleisteteStunden`.
3. `Manager`: erbt von `Festangestellter`, hat zusätzlich `double monatsBonus`. Monatsgehalt = `super.berechneMonatsgehalt() + monatsBonus`.

Erstelle in `Main` eine Liste `ArrayList<Angestellter>`, füge Vertreter aller drei Typen hinzu, iteriere darüber und gib die monatlichen Gehälter sowie die Gesamtsumme aller Gehälter aus.

**Fertig, wenn:** Alle drei Subklassen ihre Gehaltsberechnung spezifisch umsetzen und die Abrechnung polymorph über die Liste erfolgt.
