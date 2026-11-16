# Übung 8 – Medienbibliothek mit Ausleihfristen und LocalDate

**Thema:** Abstrakte Klassen, `LocalDate`-Arithmetik (`plusDays`, `plusWeeks`), Überfälligkeitsprüfung

Erstelle eine abstrakte Klasse `Medium` im Package `einheit_05.uebung.uebung08` mit:
- `String titel`
- `String signatur`
- `LocalDate ausleihDatum`
- Konstruktor, Getter, Setter und `toString()`
- abstrakte Methode `public abstract LocalDate berechneRueckgabeDatum()`
- finale Methode `public final boolean istUeberfaellig(LocalDate pruefDatum)`: gibt `true` zurück, falls `pruefDatum` nach dem errechneten Rückgabedatum liegt.

Erstelle zwei Subklassen:
1. `Buch`: hat `String autor` und `int seitenAnzahl`. Leihfrist = 4 Wochen (`ausleihDatum.plusWeeks(4)`).
2. `Dvd`: **final class**, hat `int laufzeitMinuten`. Leihfrist = 7 Tage (`ausleihDatum.plusDays(7)`).

Erstelle eine Verwaltungsklasse `Bibliothek`:
- `String name`
- `ArrayList<Medium> ausgelieheneMedien`
- `addMedium(Medium m)`
- `zeigeUeberfaelligeMedien(LocalDate stichtag)`: listet alle Medien auf, die am Stichtag überfällig sind, inklusive Titel, Ausleihdatum und errechnetem Rückgabedatum.

Erstelle in `Main` Medien mit verschiedenen Ausleihdaten, füge sie der Bibliothek hinzu und prüfe die Überfälligkeiten an einem Testdatum.

**Fertig, wenn:** Die Fristberechnungen für verschiedene Medientypen dynamisch mit `LocalDate` erfolgen und die Überfälligkeitsprüfung einwandfrei funktioniert.
