# Übung 3 – Vererbung und Methodenüberschreibung (Mitarbeiter und Manager)

**Thema:** Überschreiben von Methoden mit `@Override` und Zugriff auf Superklassen-Methoden

Erstelle eine Basisklasse `Mitarbeiter` mit den Attributen:
- `id` (`int`, via statischem Counter ab `100`)
- `name` (`String`)
- `grundgehalt` (`double`)

Implementiere in `Mitarbeiter` die Methode `berechneGehalt()`, die das `grundgehalt` zurückgibt.

Erstelle eine abgeleitete Klasse `Manager`, die von `Mitarbeiter` erbt und ein zusätzliches Attribut `bonus` (`double`) besitzt. Überschreibe in `Manager` die Methode `berechneGehalt()`, sodass das Grundgehalt der Superklasse zuzüglich des Bonus berechnet und zurückgegeben wird (`super.berechneGehalt() + bonus`).

Erstelle in `main` mindestens einen Mitarbeiter und einen Manager und gib deren berechnete Gehälter aus.

**Fertig, wenn:** Die Methode `berechneGehalt()` im Manager korrekt überschrieben wird und das Gesamteinkommen inkl. Bonus liefert.
