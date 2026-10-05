# Grundlagen Programmieren (WS 2026/27)

Die Lehrveranstaltung wird auf Deutsch abgehalten. Nach jeder LV werden zehn
Übungen mit ansteigendem Schwierigkeitsgrad im passenden Ordner
`uebung/uebungN/` abgelegt. Die zugehörigen Lösungen werden unter
`src/main/java/einheit_N/uebungN/` gespeichert. Aufgaben und Lösungen werden
nach jeder LV an die tatsächlich behandelten Inhalte angepasst. Das Repository
ist Work in Progress; diese Aktualisierung erfolgt derzeit nicht automatisch.

## LV-Termine

| Datum | Status | Wichtig |
|:------|:-------|:--------|
| 28.09.2026 | Abgeschlossen | Einführung |
| 05.10.2026 | Abgeschlossen | |
| 19.10.2026 | Offen | |
| 02.11.2026 | Offen | **Zwischentest 1** |
| 16.11.2026 | Offen | |
| 30.11.2026 | Offen | |
| 14.12.2026 | Offen | **Zwischentest 2** |
| 11.01.2027 | Offen | |
| 18.01.2027 | Offen | **Haupttermin – keine Lehrveranstaltung** |

Der Status wird nach jedem Termin aktualisiert. Besondere Termine sind in der
Spalte „Wichtig“ gekennzeichnet.

## Bisherige Inhalte

### Einheit 01 – 28.09.2026

**Package:** `einheit_01` · **Status:** Abgeschlossen

| Thema | Behandelt | Stand und nächste Schritte |
|:------|:----------|:---------------------------|
| Organisation der Lehrveranstaltung | Organisation und Ablauf der LV wurden besprochen. | Einführung abgeschlossen; der Ablauf gilt für das weitere Semester. |
| KI-Coding | Einsatz und Rolle von KI beim Programmieren wurden thematisiert. | Erste Einordnung abgeschlossen; KI-Vorschläge bei praktischen Aufgaben kritisch prüfen und nachvollziehen. |
| UML-Klassendiagramme | Klassendiagramme wurden gemeinsam auf einem Flipchart bis zum aktuellen Lernstand gezeichnet. | Erste manuelle Modellierung abgeschlossen; UML wird weiter verwendet. Eine Software für Klassendiagramme steht noch aus. |
| Klassen und Objekte | Am Beispiel `Student` erfolgte ein Einstieg in Klassen, Objekte, Attribute, Konstruktoren und Methoden. | Einstieg behandelt; Java-Grundlagen werden in den nächsten Einheiten wiederholt, vertieft und laufend angewendet. |
| Entwicklungswerkzeuge | Die praktische Verwendung der Entwicklungs- und UML-Werkzeuge wurde noch nicht behandelt. | Noch offen; Tool-Einsatz folgt in einer späteren Einheit. |

**Beispiel `Student`:** Ein Student wird durch Vorname, Nachname, Geschlecht,
Semester und Matrikelnummer beschrieben. Der Konstruktor initialisiert das
Objekt, Getter stellen ausgewählte Werte bereit und `toString()` gibt den
Objektzustand aus. Die Methode `advanceSemester()` erhöht das Semester bis
maximal sechs; danach meldet sie, dass kein weiterer Wechsel möglich ist.
`Main` erstellt ein Studentenobjekt, gibt dessen Zustand aus und führt die
Semesterwechsel vor.

**Minimale Abfolge:** Anforderungen und Studentendaten festlegen → Klasse,
Attribute und Methoden im UML-Diagramm skizzieren → Klasse und Konstruktor
implementieren → Objekt in `Main` erzeugen und ausgeben → Semesterwechsel
ausführen und die Grenze beim sechsten Semester prüfen.

Die Themen dieser Einführung sind ein Ausgangspunkt und werden im weiteren
Semester wiederholt und in neuen Aufgaben angewendet.

### Einheit 02 – 05.10.2026

**Package:** `einheit_02` · **Status:** Abgeschlossen

| Thema | Behandelt | Stand und nächste Schritte |
|:------|:----------|:---------------------------|
| Wiederholung OOP & Kapselung | Festigung von Klassen, Attributen, Konstruktoren und Methodenlogik am Beispiel `Fahrgeschaeft`. | Abgeschlossen; Kapselung und Validierungslogik in Methoden werden weiterhin standardmäßig angewendet. |
| Aufzählungstypen (`enum`) | Einführung von Enums zur typsicheren Modellierung fester Wertebereiche (`Geschlecht`, `Kategorie`). | Grundlagen vermittelt; Enums werden zur Zustands- und Kategoriesteuerung in Klassen integriert. |
| Objektinteraktion & Matching | Methoden mit Objektparametern und Attributvergleichen am Beispiel `Mann`, `Frau` und `date()`. | Praktisch erprobt; Interaktion zwischen mehreren Objekten wird in komplexeren Domänenmodellen vertieft. |
| Dynamische Listen (`ArrayList`) | Verwendung von `java.util.ArrayList`, Generics (`<String>`, `<Integer>`, `<Mann>`) sowie Methoden wie `add()`, `remove()`, `contains()` und `size()`. | Grundlegende Listenoperationen behandelt; dynamische Datenstrukturen ersetzen künftig statische Arrays bei variabler Elementanzahl. |
| Dateizugriff & CSV-Parsing | Einlesen einer CSV-Datei (`namen.csv`) mittels `BufferedReader` und `FileReader`, Zeilen-Splitting und Zufallsauswahl. | Erste Dateiverarbeitung demonstriert; robuste Ein-/Ausgabe und Fehlerbehandlung (`try-catch`) werden schrittweise erweitert. |

**Beispiele der Einheit:**
- **`Fahrgeschaeft`:** Modelliert Fahrgeschäfte mit Name, Preis, Öffnungsstatus und Kapazität. Die Methode `erhoehen()` validiert Preisänderungen (nur Erhöhungen zulässig).
- **`Tinder` / Matching:** Veranschaulicht Enums (`Geschlecht`, `Kategorie`) und Objektinteraktionen: Ein `Mann` kann eine `Frau` daten, wobei das Date nur bei übereinstimmender Kategorie erfolgreich ist.
- **`List` (`ArrayList`):** Demonstriert das dynamische Hinzufügen, Entfernen, Durchsuchen und Iterieren von Datensätzen für Standardtypen und eigene Objekte.
- **`Auswahl` (CSV):** Liest Namen aus einer CSV-Datei in eine `ArrayList` ein und wählt per Zufallsgenerator (`Random`) eine Person aus.

**Minimale Abfolge:** Domänenmodell und Enums definieren → Klassen mit typsicheren Attributen und Konstruktoren implementieren → Interaktionslogik zwischen Objekten gestalten → Objekte in dynamischen `ArrayList`-Sammlungen verwalten, filtern und auswerten.
