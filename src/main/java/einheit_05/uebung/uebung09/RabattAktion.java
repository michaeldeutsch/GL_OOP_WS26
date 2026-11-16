package einheit_05.uebung.uebung09;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class RabattAktion {
    private String aktionsName;
    private String beschreibung;

    public abstract double wendeRabattAn(double urspruenglicherPreis, int anzahl);
}
