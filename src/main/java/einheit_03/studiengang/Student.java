package einheit_03.studiengang;

public class Student {

    private final int matrikelNr;
    private String vorname;
    private String nachname;
    private Studiengang studiengang;

    public Student(int matrikelNr, String vorname, String nachname) {
        this.matrikelNr = matrikelNr;
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public void addStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }

    @Override
    public String toString() {
        return "Student{" +
                "matrikelNr=" + matrikelNr +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", studiengang=" + studiengang +
                '}';
    }
}
