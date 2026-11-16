package einheit_05.uebung.uebung07;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// Finale Klasse: Keine Subklassen erlaubt
@Getter
@Setter
@ToString(callSuper = true)
public final class ElektroRoller extends Transportmittel {
    private int akkuleistungWh;

    public ElektroRoller(String kennzeichen, int baujahr, int kilometerstand, int akkuleistungWh) {
        super(kennzeichen, baujahr, kilometerstand);
        this.akkuleistungWh = akkuleistungWh;
    }

    @Override
    public double berechneWartungskosten() {
        return 50.0 + (getKilometerstand() * 0.02);
    }
}
