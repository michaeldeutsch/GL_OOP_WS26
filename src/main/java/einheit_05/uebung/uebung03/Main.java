package einheit_05.uebung.uebung03;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier("System-Admin");

        System.out.println("=== Test der überladenen sende()-Methoden ===");
        // 1. Einfacher Broadcast
        notifier.sende("Server-Wartung um 22:00 Uhr");

        // 2. An spezifischen Empfänger
        notifier.sende("Bitte Bericht einreichen", "Max Mustermann");

        // 3. Mit Priorität
        notifier.sende("Datenbank-Fehler aufgetreten!", "Dev-Team", 3);

        // 4. Volle Signatur mit Kanal
        notifier.sende("Ihr Passwort wurde geändert", "Anna Musterfrau", 2, true);
    }
}
