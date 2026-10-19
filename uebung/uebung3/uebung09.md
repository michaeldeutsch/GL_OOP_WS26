# Übung 9 – Hierarchische Assoziationen (Universität)

**Thema:** Mehrstufige 1:n-Beziehungen und aggregierte Suche

Modelliere eine mehrstufige Struktur aus `Professor`, `Fakultaet` und `Universitaet`:
- Klasse `Professor` mit `profId` (statische Nummerierung ab `1`), `name` und `fachgebiet`.
- Klasse `Fakultaet` mit `name` und einer `ArrayList<Professor>`.
- Klasse `Universitaet` mit `name` und einer `ArrayList<Fakultaet>`.

Implementiere in `Universitaet`:
- `addFakultaet(Fakultaet f)`
- `getGesamtAnzahlProfessoren()`: ermittelt über alle Fakultäten hinweg die Gesamtanzahl aller Professoren.
- `sucheProfessorenNachFachgebiet(String fachgebiet)`: durchsucht alle Fakultäten und liefert eine Liste aller Professoren des gesuchten Fachgebiets.

**Fertig, wenn:** Eine Universitätsstruktur mit mehreren Fakultäten und Professoren aufgebaut wird und abteilungsübergreifend Professoren gezählt und gefiltert werden können.
