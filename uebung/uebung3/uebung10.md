# Übung 10 – Sportliga- und Meisterschaftsverwaltung (Synthese)

**Thema:** Gesamtsystem aus statischen Zählern, Enums, Assoziationen und Tabellenauswertungen

Modelliere ein Verwaltungssystem für eine Sportliga:
- Enum `LigaStatus`: `AMATEUR`, `PROFI`.
- Klasse `Athlet`: `id` (fortlaufend via statischem Zähler ab `1`), `name`, `alter` und `punkte` (`int`).
- Klasse `Verein`: `name`, `status` (`LigaStatus`), `ArrayList<Athlet>`. Bietet Methoden `addAthlet(Athlet a)`, `getGesamtPunkte()` (Summe der Punkte aller Athleten) und `getBesterAthlet()` (Athlet mit den meisten Punkten).
- Klasse `Liga`: `ligaName`, `ArrayList<Verein>`. Bietet Methoden `addVerein(Verein v)`, `getMeister()` (Verein mit den höchsten Gesamtpunkten) und `zeigeTabelle()` (gibt alle Vereine mit ihren Gesamtpunkten und ihrem besten Athleten aus).

**Fertig, wenn:** Mehrere Vereine mit Athleten angelegt, die Teampunkte summiert, der Meister ermittelt und eine aussagekräftige Ligatabelle auf der Konsole ausgegeben wird.
