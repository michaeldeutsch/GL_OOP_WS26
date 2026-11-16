package einheit_05.uebung.uebung07;

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
public abstract class Transportmittel {
    private String kennzeichen;
    private int baujahr;
    private int kilometerstand;

    public abstract double berechneWartungskosten();

    // Finale Methode
    public final int getFahrzeugAlter() {
        return LocalDate.now().getYear() - baujahr;
    }
}
