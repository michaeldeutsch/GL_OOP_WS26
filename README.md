# Grundlagen Programmieren (SS 2026/27)

Diese Lehrveranstaltung vermittelt die Grundlagen der Programmierung und wird
auf Deutsch abgehalten. Das Repository dokumentiert die Inhalte und den
Lernfortschritt der einzelnen Einheiten. Jede Einheit wird einem eigenen Java-
Package zugeordnet, zum Beispiel `einheit_01`.

## LV-Termine und Einheiten

| Einheit | Datum | Beginn | Ende | Raum | Lektor/in | Status |
|:--------|:------|:-------|:-----|:-----|:----------|:-------|
| 01 | 28.09.2026 | 08:50 | 12:05 | L-218 | Deutsch | Abgehalten |
| 02 | 05.10.2026 | 13:00 | 16:15 | L-323 | Deutsch | Coming soon |
| 03 | 19.10.2026 | 13:00 | 16:15 | L-316 | Deutsch | Coming soon |
| 04 | 02.11.2026 | 13:00 | 16:15 | L-223 | Deutsch | Coming soon |
| 05 | 16.11.2026 | 13:00 | 16:15 | L-218 | Deutsch | Coming soon |
| 06 | 30.11.2026 | 13:00 | 16:15 | L-316 | Deutsch | Coming soon |
| 07 | 14.12.2026 | 13:00 | 15:25 | L-119 | Deutsch | Coming soon |
| 08 | 11.01.2027 | Nicht angegeben | Nicht angegeben | Nicht angegeben | Deutsch | Coming soon |

Die Themen und Lernziele der kommenden Einheiten werden nach den jeweiligen
Lehrveranstaltungen ergänzt.

## Einheit 01 – 28.09.2026

**Package:** `einheit_01`
**Status:** Abgehalten

| Thema | Kurze Erklärung | Nach der Einheit soll verstanden sein |
|:------|:----------------|:-------------------------------------|
| Organisation und Ablauf der Lehrveranstaltung | Die Organisation und der Ablauf der LV wurden besprochen. | Die Studierenden kennen den grundsätzlichen Ablauf und die Organisation der Lehrveranstaltung. |
| KI-Coding | Der Einsatz von KI beim Programmieren und ihre Rolle im Lernprozess wurden thematisiert. | Die Studierenden wissen, dass KI unterstützen kann, ihre Vorschläge aber überprüft und verstanden werden müssen. |
| UML-Klassendiagramme | Klassendiagramme wurden gemeinsam auf einem Flipchart gezeichnet. | Die Studierenden können Klassen, Attribute, Methoden und einfache Beziehungen in einem Klassendiagramm erkennen. |
| Klassen und Objekte in Java | Das Beispiel `Student` verbindet das Klassendiagramm mit Java-Code und zeigt Attribute, Konstruktor und Methoden. | Die Studierenden verstehen, dass eine Klasse Aufbau und Verhalten von Objekten beschreibt und wie diese im Java-Code dargestellt werden. |
| Software für Klassendiagramme | Die praktische Verwendung einer Software zum Erstellen von Klassendiagrammen wurde noch nicht behandelt. Die Diagramme wurden auf dem Flipchart gezeichnet. | Die Studierenden lernen in einer folgenden Einheit eine Software zur Erstellung von Klassendiagrammen kennen. |

### Beispiele in `einheit_01`

#### Beispiel: Student und Semesterwechsel

**Aufgabenstellung:** Ein Student soll mit Vorname, Nachname, Geschlecht,
aktuellem Semester und Matrikelnummer modelliert werden. Das Programm soll
Studierenden anlegen und den Semesterwechsel darstellen. Nach dem sechsten
Semester darf kein weiteres Semester begonnen werden.

**Umsetzung:** `Student.java` speichert die Daten als Attribute, setzt sie im
Konstruktor und stellt sie mit `toString()` dar. Die Methode
`advanceSemester()` erhöht das Semester bis maximal sechs und meldet mit ihrem
Rückgabewert, ob der Wechsel möglich war. `Main.java` erzeugt ein Beispielobjekt,
gibt es aus und ruft den Semesterwechsel wiederholt auf.

**Ablauf:**

1. Anforderungen und Daten des Studenten festlegen.
2. Klasse, Attribute und Methoden als UML-Klassendiagramm skizzieren.
3. Klasse `Student` mit Konstruktor und Semesterlogik implementieren.
4. In `Main` ein Objekt erzeugen und ausgeben.
5. Semesterwechsel einschließlich der Grenze beim sechsten Semester ausprobieren.

## Weitere Einheiten

Die Inhalte werden nach jeder Lehrveranstaltung ergänzt und dem passenden
Package zugeordnet:

- `einheit_02` – 05.10.2026: Coming soon
- `einheit_03` – 19.10.2026: Coming soon
- `einheit_04` – 02.11.2026: Coming soon
- `einheit_05` – 16.11.2026: Coming soon
- `einheit_06` – 30.11.2026: Coming soon
- `einheit_07` – 14.12.2026: Coming soon
- `einheit_08` – 11.01.2027: Coming soon
