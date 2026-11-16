package einheit_05.uebung.uebung06;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Festangestellter extends Angestellter {
    private double monatsGrundgehalt;

    public Festangestellter(int id, String name, LocalDate geburtsdatum, double monatsGrundgehalt) {
        super(id, name, geburtsdatum);
        this.monatsGrundgehalt = monatsGrundgehalt;
    }

    @Override
    public double berechneMonatsgehalt() {
        return monatsGrundgehalt;
    }
}
