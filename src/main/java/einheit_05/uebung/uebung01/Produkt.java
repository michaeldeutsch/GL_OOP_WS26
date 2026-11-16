package einheit_05.uebung.uebung01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produkt {
    private int id;
    private String bezeichnung;
    private double preis;
    private String kategorie;
}
