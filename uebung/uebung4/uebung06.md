# Übung 6 – Buchungscodes mit Eindeutigkeitsprüfung & Ticket-Klassen

**Thema:** Kollisionserkennung via statischer Liste kombiniert mit Klassenvererbung

Erstelle eine Basisklasse `Ticket` mit:
- statischer Liste `ALL_CODES` (`ArrayList<String>`)
- `String code`
- `double basispreis`

Im Konstruktor von `Ticket` wird geprüft:
- Falls `code` bereits in `ALL_CODES` existiert: Setze `this.code = "INVALID"` und gib eine Warnung aus.
- Andernfalls: Füge `code` zu `ALL_CODES` hinzu.

Implementiere eine Methode `getEndpreis()`, die den `basispreis` zurückgibt.

Erstelle eine Subklasse `VIPTicket`, die von `Ticket` erbt und zusätzlich `loungeZugang` (`boolean`) und `zuschlag` (`double`) besitzt.
Überschreibe `getEndpreis()`, sodass `super.getEndpreis() + zuschlag` berechnet wird.

Erstelle in `main` mehrere Standard- und VIP-Tickets (inklusive eines doppelten Codes) und gib die Endpreise aus.

**Fertig, wenn:** Doppelte Buchungscodes abgefangen werden und VIP-Tickets den korrekten Endpreis inklusive Zuschlag berechnen.
