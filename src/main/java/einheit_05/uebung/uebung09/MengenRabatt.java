package einheit_05.uebung.uebung09;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class MengenRabatt extends RabattAktion {
    private int mindestMenge;
    private double prozentSatz;

    public MengenRabatt(String aktionsName, String beschreibung, int mindestMenge, double prozentSatz) {
        super(aktionsName, beschreibung);
        this.mindestMenge = mindestMenge;
        this.prozentSatz = prozentSatz;
    }

    @Override
    public double wendeRabattAn(double urspruenglicherPreis, int anzahl) {
        double gesamt = urspruenglicherPreis * anzahl;
        if (anzahl >= mindestMenge) {
            double nachlass = gesamt * (prozentSatz / 100.0);
            return Math.max(0.0, gesamt - nachlass);
        }
        return gesamt;
    }
}
