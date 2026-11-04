# Übung 8 – Bankkonto-Hierarchie mit Überziehungslogik

**Thema:** Spezialisierte Methodenlogik in Subklassen (`Girokonto`, `Sparkonto`) und statische IBAN-Generierung

Erstelle eine Basisklasse `Konto` mit:
- statischem Zähler `COUNTER` ab `1001`
- `final int kontoNummer`
- `String inhaber`
- `double kontostand`

Methoden in `Konto`:
- `einzahlen(double betrag)`: erhöht den Kontostand (nur positive Beträge).
- `abheben(double betrag)`: hebt ab, sofern `kontostand >= betrag`. Gibt `boolean` zurück.

Erstelle zwei Subklassen:
1. `Girokonto`: besitzt zusätzlich `dispolimit` (`double`). Überschreibe `abheben(double betrag)`, sodass Abhebungen bis zu `-(dispolimit)` erlaubt sind.
2. `Sparkonto`: besitzt zusätzlich `zinssatz` (`double`). Das Sparkonto erlaubt keine Überziehung. Implementiere `zinsenGutschreiben()`, die Zinsen zum Kontostand addiert.

Erstelle in `main` Konten beider Typen, führe Ein- und Auszahlungen (inkl. Überziehungsversuchen) durch und gib die Ergebnisse aus.

**Fertig, wenn:** Das Girokonto Abhebungen innerhalb des Dispos zulässt, das Sparkonto Überziehungen blockiert und Zinsen korrekt gutschreibt.
