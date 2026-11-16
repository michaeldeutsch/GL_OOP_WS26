package einheit_05.uebung.uebung08;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

// Finale Klasse: Keine Subklassen erlaubt
@Getter
@Setter
@ToString(callSuper = true)
public final class Dvd extends Medium {
    private int laufzeitMinuten;

    public Dvd(String titel, String signatur, LocalDate ausleihDatum, int laufzeitMinuten) {
        super(titel, signatur, ausleihDatum);
        this.laufzeitMinuten = laufzeitMinuten;
    }

    @Override
    public LocalDate berechneRueckgabeDatum() {
        return getAusleihDatum().plusDays(7); // 7 Tage Leihfrist
    }
}
