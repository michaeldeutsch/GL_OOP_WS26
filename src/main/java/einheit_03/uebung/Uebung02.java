package einheit_03.uebung;

public class Uebung02 {

    public static void main(String[] args) {
        Ticket t1 = new Ticket(TicketTyp.STANDARD);
        Ticket t2 = new Ticket(TicketTyp.VIP);
        Ticket t3 = new Ticket(TicketTyp.STUDENT);
        Ticket t4 = new Ticket(TicketTyp.VIP);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        System.out.println("Gesamtzahl verkaufter Tickets: " + Ticket.getGesamtVerkaufteTickets());
    }

    private enum TicketTyp {
        STANDARD,
        VIP,
        STUDENT
    }

    private static class Ticket {
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

        public int getTicketId() {
            return ticketId;
        }

        public TicketTyp getTyp() {
            return typ;
        }

        @Override
        public String toString() {
            return "Ticket{ticketId=" + ticketId + ", typ=" + typ + "}";
        }
    }
}
