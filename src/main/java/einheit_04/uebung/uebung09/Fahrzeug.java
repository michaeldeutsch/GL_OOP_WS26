package einheit_04.uebung.uebung09;

import java.util.ArrayList;

public class Fahrzeug {
    private static ArrayList<String> ALL_KENNZEICHEN = new ArrayList<>();

    private String kennzeichen;
    private String modell;
    private double tagespreis;

    public Fahrzeug(String kennzeichen, String modell, double tagespreis) {
        if (ALL_KENNZEICHEN.contains(kennzeichen)) {
            System.err.println("Kennzeichen '" + kennzeichen + "' bereits vergeben!");
            this.kennzeichen = "UNBEKANNT";
        } else {
            this.kennzeichen = kennzeichen;
            ALL_KENNZEICHEN.add(kennzeichen);
        }
        this.modell = modell;
        this.tagespreis = tagespreis;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getModell() {
        return modell;
    }

    public double getTagespreis() {
        return tagespreis;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", modell='" + modell + '\'' +
                ", tagespreis=" + tagespreis +
                '}';
    }
}
