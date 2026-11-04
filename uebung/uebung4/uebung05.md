# Übung 5 – Mehrstufige Vererbungshierarchie (Person -> Angestellter -> Dozent)

**Thema:** Kaskadierende Vererbung über mehrere Ebenen mit mehrfachem `super`-Aufruf

Modelliere eine dreistufige Hierarchie:
1. `Person`: Basisklasse mit `name` (`String`) und `alter` (`int`).
2. `Angestellter`: erbt von `Person` und ergänzt `personalNummer` (`int`, via Zähler ab `5000`) sowie `gehalt` (`double`).
3. `Dozent`: erbt von `Angestellter` und ergänzt `fachbereich` (`String`) und `lehrstunden` (`int`).

Implementiere in allen Klassen Konstruktoren, die die Attribute über `super(...)` an die jeweilige Superklasse weiterreichen, sowie `toString()`-Methoden.

Erstelle in `main` eine `Person`, einen `Angestellten` und einen `Dozenten` und gib diese auf der Konsole aus.

**Fertig, wenn:** Die Konstruktorkette über alle drei Stufen fehlerfrei funktioniert und der Dozent alle Attribute (Name, Alter, Personalnummer, Gehalt, Fachbereich, Lehrstunden) besitzt.
