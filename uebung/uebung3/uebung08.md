# Übung 8 – Fuhrpark- und Fahrzeugverwaltung

**Thema:** Statischer ID-Counter, Enums und Listenoperationen mit Entfernen

Erstelle ein Enum `FahrzeugTyp` mit den Werten `PKW`, `LKW` und `MOTORRAD`.
Erstelle eine Klasse `Fahrzeug` mit `id` (automatisch via statischem Zähler ab `1`), `modell`, `baujahr` und `typ` (`FahrzeugTyp`).
Erstelle eine Klasse `Fuhrpark` mit `standort` und einer `ArrayList<Fahrzeug>`.

Implementiere im `Fuhrpark`:
- `addFahrzeug(Fahrzeug f)`
- `entferneFahrzeug(int fahrzeugId)`: entfernt das Fahrzeug mit der entsprechenden ID und gibt `boolean` für Erfolg zurück.
- `findeFahrzeugeNeuerAls(int mindestBaujahr)`: gibt eine Liste aller Fahrzeuge zurück, deren Baujahr größer oder gleich dem Mindestbaujahr ist.

**Fertig, wenn:** Fahrzeuge mit eindeutiger ID verwaltet, gezielt anhand der ID entfernt und nach Baujahr gefiltert werden können.
