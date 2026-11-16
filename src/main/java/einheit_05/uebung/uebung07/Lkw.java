package einheit_05.uebung.uebung07;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Lkw extends Transportmittel {
    private double ladekapazitaetTonnen;

    public Lkw(String kennzeichen, int baujahr, int kilometerstand, double ladekapazitaetTonnen) {
        super(kennzeichen, baujahr, kilometerstand);
        this.ladekapazitaetTonnen = ladekapazitaetTonnen;
    }

    @Override
    public double berechneWartungskosten() {
        return 800.0 + (getKilometerstand() * 0.08) + (ladekapazitaetTonnen * 50.0);
    }
}
