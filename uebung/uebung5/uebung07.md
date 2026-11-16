# Übung 7 – Flottenverwaltung & Polymorphe Wartungskosten

**Thema:** Abstrakte Klassen, finale Klassen, Polymorphismus und Aggregation in Sammlungen

Erstelle eine abstrakte Klasse `Transportmittel` im Package `einheit_05.uebung.uebung07` mit:
- `String kennzeichen`
- `int baujahr`
- `int kilometerstand`
- Konstruktor, Getter, Setter und `toString()`
- abstrakte Methode `public abstract double berechneWartungskosten()`
- finale Methode `public final int getFahrzeugAlter()`: berechnet das Alter anhand des aktuellen Jahres (`LocalDate.now().getYear() - baujahr`).

Erstelle drei Subklassen:
1. `Bus`: hat `int sitzplaetze`. Wartungskosten = `500.0 + (kilometerstand * 0.05) + (sitzplaetze * 10.0)`.
2. `Lkw`: hat `double ladekapazitaetTonnen`. Wartungskosten = `800.0 + (kilometerstand * 0.08) + (ladekapazitaetTonnen * 50.0)`.
3. `ElektroRoller`: **final class**, hat `int akkuleistungWh`. Wartungskosten = `50.0 + (kilometerstand * 0.02)`.

Erstelle eine Verwaltungsklasse `Flotte`:
- `String unternehmensName`
- `ArrayList<Transportmittel> fahrzeuge`
- `addTransportmittel(Transportmittel t)`
- `berechneGesamteWartungskosten()`: summiert die Wartungskosten aller Fahrzeuge polymorph.
- `zeigeWartungsuebersicht()`: gibt alle Fahrzeuge mit Alter und individuellen Wartungskosten aus.

Erstelle in `Main` eine Flotte und teste alle Methoden.

**Fertig, wenn:** Alle Transportmittel-Typen korrekt angelegt, die finalen Methoden unverändert aufgerufen und die Gesamtkosten über die Flotte berechnet werden.
