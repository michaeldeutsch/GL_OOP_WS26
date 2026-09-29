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
| 05.10.2026 | Offen | |
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
