package einheit_03.uebung;

public class Uebung01 {

    public static void main(String[] args) {
        Konto k1 = new Konto("Anna Schmidt");
        Konto k2 = new Konto("Bernd Müller");
        Konto k3 = new Konto("Carla Meier");

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
    }

    private static class Konto {
        private static int counter = 1000;

        private final int kontonummer;
        private final String inhaber;

        public Konto(String inhaber) {
            counter++;
            this.kontonummer = counter;
            this.inhaber = inhaber;
        }

        public int getKontonummer() {
            return kontonummer;
        }

        public String getInhaber() {
            return inhaber;
        }

        @Override
        public String toString() {
            return "Konto{kontonummer=" + kontonummer + ", inhaber='" + inhaber + "'}";
        }
    }
}
