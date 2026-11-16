package einheit_05.uebung.uebung03;

public class Notifier {
    private String senderName;

    public Notifier(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    // 1. Überladung: Nur Nachricht
    public void sende(String nachricht) {
        sende(nachricht, "Alle", 1, false);
    }

    // 2. Überladung: Nachricht + Empfänger
    public void sende(String nachricht, String empfaenger) {
        sende(nachricht, empfaenger, 1, false);
    }

    // 3. Überladung: Nachricht + Empfänger + Priorität
    public void sende(String nachricht, String empfaenger, int prioritaet) {
        sende(nachricht, empfaenger, prioritaet, false);
    }

    // 4. Vollständige Methode mit Kaskadierung
    public void sende(String nachricht, String empfaenger, int prioritaet, boolean alsEmail) {
        String kanal = alsEmail ? "E-Mail" : "Push-Benachrichtigung";
        System.out.println("[" + kanal + " | Prio " + prioritaet + "] Von: " + senderName
                + " -> An: " + empfaenger + " | Nachricht: " + nachricht);
    }
}
