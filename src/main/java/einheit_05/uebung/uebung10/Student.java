package einheit_05.uebung.uebung10;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
public class Student extends CampusMitglied {
    private int matrikelnummer;
    private String studiengang;

    public Student(int id, String vorname, String nachname, LocalDate geburtsdatum, LocalDate beitrittsdatum, int matrikelnummer, String studiengang) {
        super(id, vorname, nachname, geburtsdatum, beitrittsdatum, Rolle.STUDENT);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public String getZugangslevel() {
        return "Level 1 (Bibliothek, Hörsäle)";
    }
}
