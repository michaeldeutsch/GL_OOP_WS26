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
| 19.10.2026 | Abgeschlossen | |
| 02.11.2026 | Abgeschlossen | **Zwischentest 1** |
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

### Einheit 03 – 19.10.2026

**Package:** `einheit_03` · **Status:** Abgeschlossen

| Thema | Behandelt | Stand und nächste Schritte |
|:------|:----------|:---------------------------|
| Statische Variablen & Counter (`static`) | Klassenvariablen vs. Instanzvariablen zur zentralen Verwaltung und automatischen Nummern-/ID-Vergabe am Beispiel `Auto`. | Abgeschlossen; `static` wird gezielt für klassenweite Zähler, Konstanten und Hilfsmethoden eingesetzt. |
| 1:n Assoziationen & Objektbeziehungen | Modellierung von Beziehungen zwischen Klassen (Aggregation von Objekten in dynamischen Listen) am Beispiel `Mannschaft` und `Spieler`. | Grundlegend behandelt; Assoziationen und Kardinalitäten werden in komplexeren Systemen weiter ausgebaut. |
| Bidirektionale Verknüpfung & Konsistenz | Wechselseitige Referenzierung zwischen Entitäten (`Studiengang` <-> `Student`) und konsistente Verwaltung von Rückverweisen. | Praktisch erprobt; Konsistenzhaltung und zyklusfreie Ausgabe (`toString`) bilden die Basis für relationale Datenmodelle. |
| Enums in Fachdomänen | Einsatz von Aufzählungstypen zur Rollen- und Typisierung (`Position` im Sport, `Type` für Studiengangsarten). | Fest verankert; Enums strukturieren Zustand und Klassifizierung innerhalb von Objektbeziehungen. |
| UML-Klassendiagramme (UMLet) | Werkzeuggestützte Modellierung von Klassendiagrammen (`.uxf` / `.jpg`) für Klassenstrukturen und Assoziationen. | Erste digitale Modellierung erfolgt; UMLet wird zur visuellen Dokumentation und Vorab-Planung von Softwareentwürfen weiter genutzt. |

**Beispiele der Einheit:**
- **`Auto` (`counter`):** Veranschaulicht den Unterschied zwischen statischen Klassenvariablen (`counter`) und instanzspezifischen Attributen (`kfzNr`) zur automatischen Generierung fortlaufender Kennungen.
- **`Mannschaft` & `Spieler` (`fußball`):** Zeigt eine 1:n Assoziation mit dem Enum `Position`. Spieler werden über `anschreiben()` aufgenommen, dem Team zugewiesen und strukturiert ausgegeben.
- **`Studiengang` & `Student` (`studiengang`):** Demonstriert eine bidirektionale Beziehung inklusive Studiengangstyp (`Type` wie Bachelor/Master) sowie das gegenseitige Verknüpfen von Referenzen.
- **`UMLet-Modellierung`:** Enthält das visuelle Klassendiagramm (`Klassendiagramm_Student_Studiengang`) zur formalen Darstellung der Struktur und Beziehungen.

**Minimale Abfolge:** Klassenstruktur und Beziehungen per UMLet modellieren → Klassen mit Attributen, statischen Zählern und Enums implementieren → 1:n Assoziationen über `ArrayList` aufbauen → Referenzen (ggf. bidirektional) setzen und Konsistenz sowie Ausgabe sicherstellen.

### Einheit 04 – 02.11.2026

**Package:** `einheit_04` · **Status:** Abgeschlossen

| Thema | Behandelt | Stand und nächste Schritte |
|:------|:----------|:---------------------------|
| Eindeutigkeitsprüfung & Duplikate (`static`) | Sicherstellung eindeutiger Werte (z. B. Namen) über eine zentrale statische Sammlung (`ArrayList`) und Fallback-Handling am Beispiel `Mitarbeiter`. | Abgeschlossen; globale Duplikatsprüfungen und Validierungen werden bei Entitäten mit eindeutigen Identifikatoren eingesetzt. |
| Vererbungsgrundlagen (`extends`) | Ableiten von Subklassen aus Basisklassen zur Wiederverwendung und Spezialisierung von Attributen und Methoden am Beispiel `Lebewesen`, `Mensch` und `Tier`. | Grundlagen vermittelt; Vererbungshierarchien werden in den kommenden Einheiten vertieft und um Polymorphismus erweitert. |
| Konstruktorkaskade (`super`) | Weiterleitung von Konstruktorparametern an die Superklasse mittels `super(...)` zur sauberen Initialisierung geerbter Attribute. | Behandelt und gefestigt; Aufruf der Superkonstruktoren bildet den Standard bei abgeleiteten Klassen. |
| Methodenüberschreibung (`@Override`) | Anpassen und Erweitern geerbter Methodenlogik (`toString()`) und Zugriff auf Superklassen-Methoden (`super.getName()`, `super.getAlter()`). | Praktisch erprobt; Überschreiben von Methoden wird zur individuellen Verhaltensteuerung in Subklassen weiter angewendet. |
| Zwischentest 1 | Durchführung des ersten Zwischentests (ZT1) zur Überprüfung des bisherigen OOP-Wissensstands. | Abgeschlossen; Aufgabenstellung und Musterlösung sind im Repository hinterlegt. |

**Beispiele der Einheit:**
- **`Mitarbeiter` (`unqiue`):** Veranschaulicht die Kombination eines statischen ID-Zählers (`COUNTER`) mit einer statischen Namensliste (`ALL_NAMES`). Bei Namensdopplung wird auf einen Standardwert (`DEFAULT_NAME = "dummy"`) ausgewichen und eine Warnung ausgegeben.
- **`Lebewesen`, `Tier` & `Mensch` (`vererbung`):** Demonstriert Vererbung in Java: Die Basisklasse `Lebewesen` stellt `name` und `alter` bereit. `Tier` erweitert um `futter` und überschreibt `toString()` unter Zugriff auf `super.getName()`, während `Mensch` um `adresse` ergänzt.
- **`Zwischentest 1` (`zt.zt1` / `uebung/z1`):** In dieser Einheit fand der erste Zwischentest statt. Die Aufgabenstellung (`GL_OOP_Suessigkeitenstation_ZT1_FINAL.docx`) befindet sich unter `uebung/z1/` bzw. `src/main/java/zt/zt1/`. Die vollständige Musterlösung inklusive der Klasse `SuessigkeitenStation`, Testprogramm `Main` und UML-Klassendiagrammen (`SuessigkeitenStation.uxf` / `.pdf`) ist unter `src/main/java/zt/zt1/` abgelegt.

**Minimale Abfolge:** Eindeutigkeitsregeln mit statischen Listen und Zählern umsetzen → Basisklasse mit gemeinsamen Attributen, Gettern und Konstruktor definieren → Subklassen mit `extends` ableiten und geerbte Attribute via `super(...)` initialisieren → Subklassen-spezifische Attribute und Methoden ergänzen sowie Methoden bei Bedarf mit `@Override` überschreiben.
