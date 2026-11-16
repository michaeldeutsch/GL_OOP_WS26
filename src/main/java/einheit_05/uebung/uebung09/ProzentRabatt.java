package einheit_05.uebung.uebung09;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProzentRabatt extends RabattAktion {
    private double prozentSatz; // z.B. 15.0 für 15%

    public ProzentRabatt(String aktionsName, String beschreibung, double prozentSatz) {
        super(aktionsName, beschreibung);
        this.prozentSatz = prozentSatz;
    }

    @Override
    public double wendeRabattAn(double urspruenglicherPreis, int anzahl) {
        double gesamt = urspruenglicherPreis * anzahl;
        double nachlass = gesamt * (prozentSatz / 100.0);
        return Math.max(0.0, gesamt - nachlass);
    }
}
