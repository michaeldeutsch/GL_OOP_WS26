# Beschreibung des Klassendiagramms: Student & Studiengang

Dieses Dokument beschreibt den Aufbau, die Modellelemente und die Beziehungen des UML-Klassendiagramms (`Klassendiagramm_Student_Studiengang.uxf` / `.jpg`) aus **Einheit 03**.

---

### 1. Überblick

Das Klassendiagramm modelliert das Zusammenspiel zwischen Studierenden (`Student`), deren akademischem Abschlussgrad (`Type`) sowie dem angebotenen Studiengang (`Studiengang`). Es veranschaulicht zentrale Konzepte der objektorientierten Programmierung wie:
- Kapselung (`private`-Attribute)
- Statische Klassenvariablen (`static COUNTER`)
- Unveränderliche Attribute (`readOnly` / `final`)
- Eindeutigkeitsbedingungen (`unique`)
- Enumerationen (`<< Type >>`)
- Assoziationen mit Kardinalitäten (`0..n` zu `0..1`)

---

### 2. Detaillierte Klassen- und Elementbeschreibung

#### 2.1 Klasse `Student`
Die Klasse repräsentiert eine studierende Person.

- **Attribute:**
  - `_-COUNTER: int {COUNTER = 1000, +1}_`:
    - **Sichtbarkeit:** `private` (`-`)
    - **Klassenelement:** Durch die Unterstreichung als statische Variable (`static`) deklariert.
    - **Semantik:** Startet bei `1000` und wird bei jeder neuen Instanz automatisch um `1` erhöht, um fortlaufende IDs zu vergeben.
  - `-id: int {readOnly}`:
    - **Sichtbarkeit:** `private` (`-`)
    - **Eigenschaft:** `{readOnly}` – Die ID wird bei der Erzeugung vergeben und kann danach nicht mehr verändert werden (entspricht `final` in Java).
  - `-vorname: String {readOnly, unique}`:
    - **Sichtbarkeit:** `private` (`-`)
    - **Eigenschaft:** `{readOnly, unique}` – Vorname des Studenten; unveränderbar und eindeutig.
  - `-type: Type`:
    - **Sichtbarkeit:** `private` (`-`)
    - **Semantik:** Referenz auf die Enumeration `Type` zur Kennzeichnung des Studienfortschritts / -grads.

- **Methoden / Operationen:**
  - `+zeigeStudiengang(): void`:
    - **Sichtbarkeit:** `public` (`+`)
    - Gibt die Details des zugeordneten Studiengangs auf der Konsole aus.
  - `+printReport(abMonat: int, abJahr: int): String`:
    - **Sichtbarkeit:** `public` (`+`)
    - Erstellt anhand des Startmonats und -jahres einen formatierten Berichtsstring über den Studienverlauf.

---

#### 2.2 Enumeration `<< Type >>`
Ein Aufzählungstyp zur Definition der möglichen Studienarten / Abschlussgrade.

- **Stereotyp:** `<< Type >>` (bzw. `<<enumeration>>`)
- **Werte:**
  - `BACHELOR`: Bachelor-Studium
  - `MASTER`: Master-Studium
  - `DOKTORAT`: Doktorats- bzw. PhD-Studium

---

#### 2.3 Klasse `Studiengang`
Repräsentiert ein universitäres Studienprogramm, das mehrere Studenten umfasst.

- **Attribute:**
  - `-name: String {unique}`:
    - **Sichtbarkeit:** `private` (`-`)
    - **Eigenschaft:** `{unique}` – Eindeutige Bezeichnung des Studiengangs (z. B. `"PIT"` oder `"Software Engineering"`).
  - `-studenten: Student[]`:
    - **Sichtbarkeit:** `private` (`-`)
    - **Semantik:** Array bzw. Collection aller in diesem Studiengang eingeschriebenen Studenten.

---

### 3. Beziehungen und Assoziationen

Zwischen den Klassen `Student` und `Studiengang` besteht eine gerichtete Assoziation:

$$\text{Student} \quad \xleftrightarrow[\text{0..n}]{\text{is part of >}} \quad \text{Studiengang} \quad (\text{0..1})$$

- **Leserichtung & Name:** `is part of >` (Ein Student ist Teil eines Studiengangs).
- **Kardinalitäten / Multiplizitäten:**
  - **`0..n` auf Seite von `Student`:** Ein Studiengang kann beliebig viele (oder auch noch keine) Studenten enthalten.
  - **`0..1` auf Seite von `Studiengang`:** Ein Student kann maximal einem Studiengang zugeordnet sein (oder vorübergehend keinem).

---

### 4. UML-Notationsübersicht

| UML-Notation | Bedeutung | Java-Äquivalent |
| :--- | :--- | :--- |
| `-` | `private` Sichtbarkeit | `private` |
| `+` | `public` Sichtbarkeit | `public` |
| `_Attribut_` (unterstrichen) | Statische Klassenvariable | `static` |
| `{readOnly}` | Unveränderlich nach Initialisierung | `final` |
| `{unique}` | Wert muss im System eindeutig sein | Eindeutigkeitsvalidierung / DB-Constraint |
| `<< Name >>` | Stereotyp (z. B. Enum / Interface) | `enum` bzw. `interface` |
| `0..1` / `0..n` | Multiplizitäten der Beziehung | 1:n-Referenz / `ArrayList<Student>` |
