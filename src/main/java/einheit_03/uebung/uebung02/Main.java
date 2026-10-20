package einheit_03.uebung.uebung02;

public class Main {

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
}
