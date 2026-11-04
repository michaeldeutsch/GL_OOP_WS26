# Übung 10 – Schulverwaltungssystem mit Personen-Hierarchie

**Thema:** Umfassende Modellierung von Vererbung, Eindeutigkeit, Enums und Listenoperationen

Erstelle ein Enum `Fachbereich` mit den Werten `INFORMATIK`, `WIRTSCHAFT` und `MEDIEN`.

Erstelle eine Basisklasse `Person` mit:
- statischem Zähler `ID_COUNTER` ab `1`
- statischer Liste `ALL_EMAILS` (`ArrayList<String>`)
- `final int id`
- `String name`
- `String email` (bei Duplikat: `"duplicate@schule.at"`)

Erstelle zwei Subklassen von `Person`:
1. `Schueler`: ergänzt `klassenName` (`String`) und `notenschnitt` (`double`).
2. `Lehrer`: ergänzt `fachbereich` (`Fachbereich`) und `gehalt` (`double`).

Erstelle eine Verwaltungsklasse `Schule` mit:
- `String schulname`
- `ArrayList<Person> mitglieder`
- `addPerson(Person p)`
- `zeigeAlleMitglieder()`
- `zeigeNurSchueler()`
- `berechneGesamtGehaelter()`: summiert die Gehälter aller Lehrer.

Erstelle in `main` eine Schule, füge Schüler und Lehrer (inkl. E-Mail-Duplikat-Test) hinzu und teste alle Methoden.

**Fertig, wenn:** Alle Vererbungsbeziehungen, Eindeutigkeitsprüfungen, Filterungen und Berechnungen einwandfrei funktionieren.
