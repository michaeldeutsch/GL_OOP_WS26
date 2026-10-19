# Übung 7 – Aggregierte Kennzahlen in Assoziationen

**Thema:** Iteration, Berechnungen und Filterung über verknüpfte Listen

Erstelle ein Enum `Level` mit `JUNIOR`, `MEDIOR` und `SENIOR`.
Erstelle eine Klasse `Entwickler` mit `name`, `level` (`Level`) und `stundensatz` (`double`).
Erstelle eine Klasse `Projekt` mit `projektName` und einer `ArrayList<Entwickler>`.

Implementiere im `Projekt`:
- `addEntwickler(Entwickler entwickler)`
- `berechneGesamtStundensatz()`: summiert die Stundensätze aller Entwickler im Projekt.
- `getEntwicklerNachLevel(Level level)`: liefert eine neue `ArrayList<Entwickler>` mit allen Entwicklern des gewünschten Levels.

**Fertig, wenn:** Der Gesamtstundensatz des Projektteams berechnet und Entwickler nach ihrem Erfahrungsgrad gefiltert werden können.
