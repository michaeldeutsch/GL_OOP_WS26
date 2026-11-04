package zt.zt1;

public class SuessigkeitenStation {
    private final String bezeichnung;
    private int bestand;
    private boolean geoeffnet;

    public SuessigkeitenStation(String bezeichnung, int anfangsbestand, boolean geoeffnet) {
        this.bezeichnung = bezeichnung;
        this.bestand = Math.max(0, anfangsbestand);
        this.geoeffnet = geoeffnet;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getBestand() {
        return bestand;
    }

    public boolean isGeoeffnet() {
        return geoeffnet;
    }

    public void setBestand(int bestand) {
        if (bestand >= 0) {
            this.bestand = bestand;
        }
    }

    public void setGeoeffnet(boolean geoeffnet) {
        this.geoeffnet = geoeffnet;
    }

    public boolean verteile(int anzahl) {
        if (geoeffnet && anzahl > 0 && bestand >= anzahl) {
            bestand -= anzahl;
            return true;
        }
        return false;
    }
}
