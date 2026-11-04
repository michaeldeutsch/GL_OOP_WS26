# Übung 7 – Tier-Hierarchie mit Vererbung und Lauten

**Thema:** Spezialisierung von Subklassen und polymorpher Methodenaufruf

Erstelle eine Basisklasse `Tier` mit `name` (`String`), `alter` (`int`) und `futter` (`String`). Implementiere die Methode `gibLaut()`, die standardmäßig `"..."` ausgibt.

Erstelle drei Subklassen:
1. `Hund` (zusätzlich `rasse`): überschreibt `gibLaut()` mit `"Wau! Wau!"`.
2. `Katze` (zusätzlich `kratzbaumLiebhaber` (`boolean`)): überschreibt `gibLaut()` mit `"Miau!"`.
3. `Vogel` (zusätzlich `fluegelspannweite` (`double`)): überschreibt `gibLaut()` mit `"Tschiep!"`.

Erstelle in `main` eine `ArrayList<Tier>`, füge Instanzen aller drei Tierarten hinzu und iteriere über die Liste, um `toString()` und `gibLaut()` aufzurufen.

**Fertig, wenn:** Alle Tiere von der Basisklasse erben und beim Durchlaufen der Liste die tierartspezifischen Laute ausgegeben werden.
