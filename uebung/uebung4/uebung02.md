# Übung 2 – Eindeutige Benutzernamen mit statischer Namensliste

**Thema:** Eindeutigkeitsprüfung über `static ArrayList` und automatische ID-Vergabe

Erstelle eine Klasse `Benutzer` mit folgenden Attributen:
- statischer Zähler `COUNTER` (Startwert `1`)
- statische Liste `ALL_USERNAMES` (`ArrayList<String>`)
- statische Konstante `DEFAULT_NAME = "gast"`
- `final int id`
- `String username`
- `String email`

Im Konstruktor soll geprüft werden, ob der übergebene `username` bereits in `ALL_USERNAMES` existiert:
- Falls ja: Fehlermeldung auf der Konsole ausgeben und `username` auf `DEFAULT_NAME` setzen.
- Falls nein: `username` zu `ALL_USERNAMES` hinzufügen.
Die `id` wird fortlaufend über `COUNTER++` vergeben.

Erstelle in `main` mehrere Benutzer (auch mit doppelten Namen) und überprüfe das Verhalten.

**Fertig, wenn:** Duplikate erkannt und abgefangen werden, eindeutige IDs vergeben werden und die Ausgabe den Zustand korrekt widerspiegelt.
