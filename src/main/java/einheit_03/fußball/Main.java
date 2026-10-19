package einheit_03.fußball;

public class Main {

    public static void main(String[] args) {
        Spieler spieler1 = new Spieler("Maxi", "Mustermann", 25, Position.MITTFELD);
        Spieler spieler2 = new Spieler("Susi", "Fröhlich", 33);

        System.out.println(spieler1);
        System.out.println(spieler2);

        Mannschaft mannschaft1 = new Mannschaft("FC Bayern");
        mannschaft1.anschreiben(spieler1);
        mannschaft1.anschreiben(spieler2);
        mannschaft1.zeigeMannschaft();

        Mannschaft mannschaft2 = new Mannschaft("FC Dortmund");
        System.out.println(mannschaft2);
    }
}
