# Übung 10 – Umfassendes FH-Campus-Verwaltungssystem

**Thema:** Gesamtsynthese aus abstrakten Klassen, Lombok, Enums, `LocalDate`, `Period`, `final`-Methoden, Polymorphismus und Listenverwaltung

Erstelle im Package `einheit_05.uebung.uebung10`:

1. Ein Enum `Rolle` mit `STUDENT`, `DOZENT`, `FORSCHENDER`.
2. Eine abstrakte Basisklasse `CampusMitglied` mit:
   - `int id`
   - `String vorname`
   - `String nachname`
   - `LocalDate geburtsdatum`
   - `LocalDate beitrittsdatum`
   - `Rolle rolle`
   - Getter, Setter, Konstruktoren (gerne via Lombok)
   - abstrakte Methode `public abstract String getZugangslevel()`
   - finale Methode `public final int berechneJahreAmCampus()`: berechnet die Jahre seit dem Beitrittsdatum mit `Period.between(beitrittsdatum, LocalDate.now()).getYears()`.
   - finale Methode `public final int berechneAlter()`: berechnet das Alter in Jahren mit `Period.between(geburtsdatum, LocalDate.now()).getYears()`.

3. Drei konkrete Subklassen von `CampusMitglied`:
   - `Student`: hat `int matrikelnummer`, `String studiengang`. Zugangslevel = `"Level 1 (Bibliothek, Hörsäle)"`.
   - `Dozent`: **final class**, hat `String lehrgebiet`, `double gehalt`. Zugangslevel = `"Level 2 (Hörsäle, Dozentenbüros, Labore)"`.
   - `Forschender`: hat `String forschungsprojekt`, `double budget`. Zugangslevel = `"Level 3 (Forschungslabore, Serverräume)"`.

4. Eine Verwaltungsklasse `CampusManager`:
   - `String campusName`
   - `ArrayList<CampusMitglied> mitglieder`
   - `addMitglied(CampusMitglied m)`
   - `zeigeAlleMitglieder()`: gibt alle Mitglieder mit Zugangslevel und Campusjahren aus.
   - `berechneDurchschnittsAlter()`: berechnet das arithmetische Mittel des Alters aller Mitglieder.
   - `findeMitgliederMitMindestJahren(int mindestJahre)`: liefert eine gefilterte Liste zurück.
   - `zeigeZugangsliste()`: gibt die Namen und das jeweilige Zugangslevel formatiert aus.

5. Eine Klasse `Main` mit einem praxisnahen Testprogramm zur Demonstration aller Funktionalitäten.

**Fertig, wenn:** Alle Vererbungs- und Zugangsregeln, Berechnungen mit `Period`, finale Methoden und Filteroperationen vollständig implementiert und getestet sind.
