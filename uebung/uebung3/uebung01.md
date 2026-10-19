# Übung 1 – Statischer Zähler zur ID-Vergabe

**Thema:** `static`-Klassenvariablen zur automatischen und eindeutigen Nummerierung

Erstelle eine Klasse `Konto` mit den Attributen `kontonummer` (`int`), `inhaber` (`String`) und einem statischen Zähler `counter` (`int`), der bei `1000` startet. Bei jeder Instanziierung eines neuen Kontos soll der Zähler um `1` erhöht und der neue Wert als `kontonummer` zugewiesen werden.

Erstelle in `main` mindestens drei Konten und gib diese zur Überprüfung auf der Konsole aus.

**Fertig, wenn:** Alle erstellten Konten fortlaufende, eindeutige Kontonummern (1001, 1002, 1003, ...) besitzen und korrekt ausgegeben werden.
