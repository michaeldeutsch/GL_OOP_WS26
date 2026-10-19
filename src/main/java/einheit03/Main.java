package einheit03;

public class Main {

    public static void main(String[] args) {
        Spieler spieler1= new Spieler("Maxi", "Mustermann", 25, Position.MITTFELD);
        Spieler spieler2 = new Spieler("Susi","Fröhlich", 33);

        System.out.println(spieler1);
        System.out.println(spieler2);

        Mannschaft mannschaft = new Mannschaft("FC Bayern");
        mannschaft.anschreiben(spieler1);
        mannschaft.anschreiben(spieler2);
        mannschaft.zeigeMannschaft();

        Mannschaft mannschaft2 = new Mannschaft("FC Dortmund");
        mannschaft2.anschreiben(spieler1);
       // System.out.println(mannschaft2);

       // System.out.println(mannschaft);

    }
}
