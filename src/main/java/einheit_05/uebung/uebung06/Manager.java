package einheit_05.uebung.uebung06;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Manager extends Festangestellter {
    private double monatsBonus;

    public Manager(int id, String name, LocalDate geburtsdatum, double monatsGrundgehalt, double monatsBonus) {
        super(id, name, geburtsdatum, monatsGrundgehalt);
        this.monatsBonus = monatsBonus;
    }

    @Override
    public double berechneMonatsgehalt() {
        return super.berechneMonatsgehalt() + monatsBonus;
    }
}
