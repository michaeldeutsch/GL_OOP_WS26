# Übung 1 – Einfache Vererbung (Fahrzeug und Auto)

**Thema:** Grundlagen der Vererbung mit `extends` und Konstruktor-Weiterleitung mit `super`

Erstelle eine Basisklasse `Fahrzeug` mit den Attributen `marke` (`String`) und `baujahr` (`int`) sowie einem passenden Konstruktor, Gettern und `toString()`.

Erstelle eine abgeleitete Klasse `Auto`, die von `Fahrzeug` erbt (`extends`) und ein zusätzliches Attribut `anzahlTueren` (`int`) besitzt. Der Konstruktor von `Auto` soll die Basisattribute über `super(marke, baujahr)` initialisieren.

Erstelle in `main` sowohl ein allgemeines `Fahrzeug` als auch ein `Auto` und gib deren Zustände auf der Konsole aus.

**Fertig, wenn:** Die Klasse `Auto` erfolgreich von `Fahrzeug` erbt, die Attribute über `super` initialisiert werden und beide Objekte korrekt auf der Konsole ausgegeben werden.
