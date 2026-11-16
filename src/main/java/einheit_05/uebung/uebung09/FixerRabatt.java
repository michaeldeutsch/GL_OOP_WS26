package einheit_05.uebung.uebung09;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class FixerRabatt extends RabattAktion {
    private double rabattBetrag; // z.B. 10.0 €

    public FixerRabatt(String aktionsName, String beschreibung, double rabattBetrag) {
        super(aktionsName, beschreibung);
        this.rabattBetrag = rabattBetrag;
    }

    @Override
    public double wendeRabattAn(double urspruenglicherPreis, int anzahl) {
        double gesamt = urspruenglicherPreis * anzahl;
        return Math.max(0.0, gesamt - rabattBetrag);
    }
}
