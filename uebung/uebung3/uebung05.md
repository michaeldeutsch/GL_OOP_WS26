# Übung 5 – Bidirektionale Assoziation

**Thema:** Gegenseitige Referenzierung zwischen zwei Klassen

Modelliere eine bidirektionale 1:n-Beziehung zwischen `Studiengang` und `Student`:
- Enum `Abschluss`: `BACHELOR`, `MASTER`.
- Klasse `Student` mit `matrikelNr` (via statischem Counter), `name` und einer Referenz `studiengang` (`Studiengang`).
- Klasse `Studiengang` mit `bezeichnung`, `abschluss` und einer `ArrayList<Student>`.

Implementiere im `Studiengang` die Methode `einschreiben(Student student)`. Diese Methode fügt den Studenten zur internen Liste hinzu und setzt gleichzeitig über `student.setStudiengang(this)` die Rückreferenz beim Studenten. Achte darauf, dass `toString()` bei beiden Klassen keine Endlosschleife auslöst.

**Fertig, wenn:** Nach dem Einschreiben der Student seinen Studiengang kennt und der Studiengang den Studenten in seiner Liste führt.
