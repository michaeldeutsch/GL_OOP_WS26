# Übung 4 – Eindeutige Seriennummern & Elektronik-Hierarchie

**Thema:** Kombination aus statischer ID-/Seriennummernvergabe und Vererbung

Erstelle eine Basisklasse `Geraet` mit:
- statischem Zähler `COUNTER` ab `1000`
- `final int seriennummer`
- `String hersteller`
- `double preis`

Erstelle eine abgeleitete Klasse `Smartphone`, die von `Geraet` erbt und zusätzlich `betriebssystem` (`String`) und `speicherGB` (`int`) enthält.

Implementiere in beiden Klassen saubere `toString()`-Methoden (in `Smartphone` unter Verwendung von `super.toString()` oder den Basisattributen).

Erstelle in `main` mehrere Geräte und Smartphones und gib sie aus.

**Fertig, wenn:** Alle Geräte fortlaufende Seriennummern erhalten und die Smartphone-Klasse alle Attribute inklusive Hersteller und Preis korrekt darstellt.
