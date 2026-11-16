# Übung 1 – Lombok Grundlagen (Produktverwaltung)

**Thema:** Reduktion von Boilerplate-Code mit Lombok (`@Data`, `@AllArgsConstructor`, `@NoArgsConstructor`)

Erstelle eine Klasse `Produkt` im Package `einheit_05.uebung.uebung01` mit den Attributen:
- `int id`
- `String bezeichnung`
- `double preis`
- `String kategorie`

Verwende die Lombok-Annotationen `@Data`, `@AllArgsConstructor` und `@NoArgsConstructor`, um Getter, Setter, `toString()`, `equals()`, `hashCode()` sowie Konstruktoren automatisch generieren zu lassen.

Erstelle eine Klasse `Main` mit einer `main`-Methode:
1. Erzeuge ein Produkt mit dem All-Args-Konstruktor.
2. Erzeuge ein zweites Produkt mit dem No-Args-Konstruktor und setze die Werte über die von Lombok generierten Setter.
3. Gib beide Produkte auf der Konsole aus.
4. Ändere den Preis eines Produkts und gib den aktualisierten Wert mittels Getter aus.

**Fertig, wenn:** Die Klasse `Produkt` ohne manuell geschriebene Getter/Setter/Konstruktoren fehlerfrei kompiliert und alle Eigenschaften in `Main` getestet und ausgegeben werden.
