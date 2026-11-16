# Übung 5 – Datumsverarbeitung mit LocalDate & Period (Mitarbeiteranalyse)

**Thema:** `java.time.LocalDate`, `java.time.Period` und Methoden zur Zeitintervall-Berechnung

Erstelle eine Klasse `Mitarbeiter` im Package `einheit_05.uebung.uebung05` unter Verwendung von Lombok (`@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`) mit:
- `int id`
- `String name`
- `LocalDate geburtsdatum`
- `LocalDate eintrittsdatum`

Implementiere folgende Methoden:
1. `public int berechneAlter()`: berechnet das aktuelle Alter in Jahren mittels `Period.between(geburtsdatum, LocalDate.now()).getYears()`.
2. `public int berechneDienstjahre()`: berechnet die vollendeten Dienstjahre mittels `Period.between(eintrittsdatum, LocalDate.now()).getYears()`.
3. `public boolean hatJubilaeum(int jahre)`: prüft, ob die Dienstjahre mindestens dem übergebenen Wert entsprechen.
4. `public String getFormatiertesProfil()`: gibt eine Übersicht mit Name, Alter, Eintrittsdatum und Dienstjahren zurück.

Erstelle in `Main` mehrere Mitarbeiter mit unterschiedlichen Geburts- und Eintrittsdaten und teste alle Berechnungen und Ausgaben.

**Fertig, wenn:** Die Alters- und Dienstjahresberechnungen über `Period.between` dynamisch und präzise funktionieren.
