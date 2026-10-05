# Übung 9 – Kapselung einer Liste in einer Verwaltungsklasse

**Thema:** Eigene Verwaltungsklasse mit interner `ArrayList`

Erstelle eine Klasse `Community`, die intern eine private `ArrayList<Person>` verwaltet.
Implementiere Methoden zum Hinzufügen (`addPerson`), Entfernen (`removePerson`), Abfragen
der Mitgliederzahl (`getAnzahl`) und Suchen nach Namen (`findePerson`).

**Fertig, wenn:** Alle Listenoperationen über die Methoden der `Community`-Klasse
gekapselt sind und die Daten nicht direkt von außen manipuliert werden können.
