package einheit_05.uebung.uebung07;

public class Main {
    public static void main(String[] args) {
        Flotte flotte = new Flotte("CityLogistics GmbH");

        flotte.addTransportmittel(new Bus("W-1234AB", 2018, 120000, 50));
        flotte.addTransportmittel(new Lkw("W-5678CD", 2016, 250000, 18.5));
        flotte.addTransportmittel(new ElektroRoller("E-SCOOT-01", 2023, 3500, 500));

        flotte.zeigeWartungsuebersicht();
    }
}
