# Übung 4 – Rollenbasierte Assoziation mit Enums

**Thema:** Enums zur Typisierung und Filterung in Assoziationen

Erstelle ein Enum `Position` mit den Werten `TORWART`, `ABWEHR`, `MITTFELD` und `ANGRIFF`.
Erstelle eine Klasse `Fussballer` mit `name`, `alter` und `position`.
Erstelle eine Klasse `Team` mit `teamName` und einer `ArrayList<Fussballer>`.

Implementiere im `Team` die Methoden:
- `addSpieler(Fussballer spieler)`: fügt einen Spieler zum Team hinzu.
- `zeigeSpielerAufPosition(Position pos)`: gibt nur diejenigen Spieler aus, die auf der übergebenen Position spielen.

**Fertig, wenn:** Spieler unterschiedlicher Positionen im Team angelegt und per Aufruf von `zeigeSpielerAufPosition` gezielt nach einer Position gefiltert ausgegeben werden.
