# Übung 3 – 1:n Assoziation (Verein und Mitglieder)

**Thema:** Aggregation von Objekten in einer `ArrayList`

Erstelle eine Klasse `Mitglied` mit `mitgliedsNr` (automatisch via statischem Zähler ab `100`), `vorname` und `nachname`.
Erstelle eine Klasse `Verein` mit einem `namen` und einer `ArrayList<Mitglied>`.

Implementiere im `Verein` die Methoden:
- `addMitglied(Mitglied mitglied)`: fügt ein neues Mitglied hinzu.
- `zeigeMitglieder()`: gibt alle Mitglieder mit ihren Nummern und Namen strukturiert aus.

**Fertig, wenn:** Mehrere Mitglieder mit eindeutigen Mitgliedsnummern erstellt, dem Verein hinzugefügt und über `zeigeMitglieder()` auf der Konsole ausgegeben werden.
