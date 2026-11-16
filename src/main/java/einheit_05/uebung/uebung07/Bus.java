package einheit_05.uebung.uebung07;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Bus extends Transportmittel {
    private int sitzplaetze;

    public Bus(String kennzeichen, int baujahr, int kilometerstand, int sitzplaetze) {
        super(kennzeichen, baujahr, kilometerstand);
        this.sitzplaetze = sitzplaetze;
    }

    @Override
    public double berechneWartungskosten() {
        return 500.0 + (getKilometerstand() * 0.05) + (sitzplaetze * 10.0);
    }
}
