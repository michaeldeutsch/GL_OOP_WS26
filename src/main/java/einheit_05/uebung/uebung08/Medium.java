package einheit_05.uebung.uebung08;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public abstract class Medium {
    private String titel;
    private String signatur;
    private LocalDate ausleihDatum;

    public abstract LocalDate berechneRueckgabeDatum();

    // Finale Methode: Überfälligkeitsprüfung
    public final boolean istUeberfaellig(LocalDate pruefDatum) {
        if (ausleihDatum == null || pruefDatum == null) {
            return false;
        }
        return pruefDatum.isAfter(berechneRueckgabeDatum());
    }
}
