# Übung 9 – Fuhrparkverwaltung mit Fahrzeug-Hierarchie

**Thema:** Polymorphe Sammlungen von Basisklassen-Objekten in Aggregationen

Erstelle eine Basisklasse `Fahrzeug` mit:
- statischer Liste `ALL_KENNZEICHEN` (`ArrayList<String>`) zur Eindeutigkeitsprüfung
- `String kennzeichen` (bei Duplikat: `"UNBEKANNT"`)
- `String modell`
- `double tagespreis`

Erstelle zwei Subklassen:
1. `Pkw`: zusätzlich `sitzplaetze` (`int`)
2. `Lkw`: zusätzlich `ladekapazitaetTonnen` (`double`)

Erstelle eine Verwaltungsklasse `Fuhrpark` mit `name` (`String`) und `ArrayList<Fahrzeug>`.
Methoden in `Fuhrpark`:
- `addFahrzeug(Fahrzeug f)`: fügt ein Fahrzeug hinzu.
- `zeigeAlleFahrzeuge()`: gibt alle Fahrzeuge mit Details aus.
- `berechneGesamteinnahmenProTag()`: summiert die `tagespreis`-Werte aller Fahrzeuge.

Erstelle in `main` einen Fuhrpark mit mehreren Pkws und Lkws und berechne die potenziellen Tageseinnahmen.

**Fertig, wenn:** Unterschiedliche Fahrzeugtypen gemeinsam im Fuhrpark verwaltet, formatiert ausgegeben und deren Gesamteinnahmen korrekt summiert werden.
