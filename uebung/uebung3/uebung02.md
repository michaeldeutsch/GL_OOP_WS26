# Übung 2 – Statische Methoden und Klassenkonstanten

**Thema:** `static`-Methoden und globale Zählerabfrage

Erstelle ein Enum `TicketTyp` mit den Werten `STANDARD`, `VIP` und `STUDENT`.
Erstelle eine Klasse `Ticket` mit den Attributen `ticketId` (`int`) und `typ` (`TicketTyp`). Die `ticketId` wird über einen statischen Zähler ab `1` fortlaufend vergeben.

Implementiere eine statische Methode `getGesamtVerkaufteTickets()`, die die Anzahl aller bisher erstellten Tickets zurückgibt. Erzeuge in `main` mehrere Tickets verschiedener Typen und gib sowohl die Tickets als auch die Gesamtzahl über die statische Methode aus.

**Fertig, wenn:** Die Tickets mit fortlaufenden IDs erzeugt werden und die statische Methode die exakte Anzahl der instanziierten Tickets liefert.
