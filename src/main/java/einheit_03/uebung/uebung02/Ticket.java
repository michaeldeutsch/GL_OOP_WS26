package einheit_03.uebung.uebung02;

public class Ticket {
    private static int counter = 0;

    private final int ticketId;
    private final TicketTyp typ;

    public Ticket(TicketTyp typ) {
        counter++;
        this.ticketId = counter;
        this.typ = typ;
    }

    public static int getGesamtVerkaufteTickets() {
        return counter;
    }

    @Override
    public String toString() {
        return "Ticket{ticketId=" + ticketId + ", typ=" + typ + "}";
    }
}
