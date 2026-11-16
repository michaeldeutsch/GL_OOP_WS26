package einheit_05.uebung.uebung06;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Freiberufler extends Angestellter {
    private double stundensatz;
    private int geleisteteStunden;

    public Freiberufler(int id, String name, LocalDate geburtsdatum, double stundensatz, int geleisteteStunden) {
        super(id, name, geburtsdatum);
        this.stundensatz = stundensatz;
        this.geleisteteStunden = geleisteteStunden;
    }

    @Override
    public double berechneMonatsgehalt() {
        return stundensatz * geleisteteStunden;
    }
}
