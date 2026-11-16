package einheit_05.uebung.uebung06;

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
public abstract class Angestellter {
    private int id;
    private String name;
    private LocalDate geburtsdatum;

    public abstract double berechneMonatsgehalt();
}
