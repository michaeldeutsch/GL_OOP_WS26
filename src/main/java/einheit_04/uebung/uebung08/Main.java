package einheit_04.uebung.uebung08;

public class Main {
    public static void main(String[] args) {
        Girokonto gk = new Girokonto("Martin", 500.0, 300.0);
        Sparkonto sk = new Sparkonto("Sandra", 1000.0, 0.03);

        gk.abheben(700.0); // 500 - 700 = -200 (im Dispo erlaubt)
        sk.abheben(1200.0); // nicht erlaubt
        sk.zinsenGutschreiben(); // 1000 + 30 = 1030

        System.out.println(gk);
        System.out.println(sk);
    }
}
