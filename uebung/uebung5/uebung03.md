# Übung 3 – Methodenüberladung (Benachrichtigungsservice)

**Thema:** Methodenüberladung (Method Overloading) mit unterschiedlichen Parameterlisten

Erstelle eine Klasse `Notifier` im Package `einheit_05.uebung.uebung03` mit einem Attribut `String senderName` (inkl. Konstruktor und Getter/Setter).

Implementiere mehrere überladene Versionen der Methode `sende(...)`:
1. `public void sende(String nachricht)`: gibt die Nachricht an den Standardempfänger `"Alle"` mit Standard-Priorität `1` aus.
2. `public void sende(String nachricht, String empfaenger)`: gibt die Nachricht an den angegebenen Empfänger mit Priorität `1` aus.
3. `public void sende(String nachricht, String empfaenger, int prioritaet)`: gibt Nachricht, Empfänger, Priorität und den `senderName` formatiert auf der Konsole aus.
4. `public void sende(String nachricht, String empfaenger, int prioritaet, boolean alsEmail)`: gibt zusätzlich aus, ob der Versand per E-Mail oder Push-Notification erfolgt.

Lass die einfacheren Überladungen intern die umfassendere Methode aufrufen (Methoden-Kaskadierung/Delegation).

Erstelle eine Klasse `Main`, um alle überladenen Varianten mit verschiedenen Aufrufen zu demonstrieren.

**Fertig, wenn:** Alle überladenen Methoden aufgerufen werden können, Standardwerte korrekt weitergeleitet werden und die Ausgaben sauber strukturiert sind.
