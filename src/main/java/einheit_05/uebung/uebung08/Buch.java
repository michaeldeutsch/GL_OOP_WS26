package einheit_05.uebung.uebung08;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Buch extends Medium {
    private String autor;
    private int seitenAnzahl;

    public Buch(String titel, String signatur, LocalDate ausleihDatum, String autor, int seitenAnzahl) {
        super(titel, signatur, ausleihDatum);
        this.autor = autor;
        this.seitenAnzahl = seitenAnzahl;
    }

    @Override
    public LocalDate berechneRueckgabeDatum() {
        return getAusleihDatum().plusWeeks(4); // 4 Wochen Leihfrist
    }
}
