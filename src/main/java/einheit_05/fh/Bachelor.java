package einheit_05.fh;

import einheit_05.person.Geschlecht;

import java.time.LocalDate;

// Finale Klasse: Von dieser Klasse kann nicht weiter geerbt werden
public final class Bachelor extends Student {

    public Bachelor(String vorname, String nachname, LocalDate geburtsdatum, Geschlecht geschlecht, boolean aktiv, int matrikelNr) {
        super(vorname, nachname, geburtsdatum, geschlecht, aktiv, matrikelNr);
    }
}
