package einheit_04.uebung.uebung06;

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("T-100", 45.00);
        VIPTicket vip1 = new VIPTicket("VIP-01", 90.00, true, 50.00);
        Ticket t2 = new Ticket("T-100", 45.00); // Duplikat -> INVALID

        System.out.println(t1);
        System.out.println(vip1);
        System.out.println(t2);
    }
}
