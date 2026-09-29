package einheit_01;

public class Student {

    private final String vorname;
    private final String nachname;
    private final boolean geschlecht;
    private int currentSemester;
    private final int matrikelNummer;

    public Student(String vorname, String nachname, boolean geschlecht, int currentSemester, int matrikelNummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geschlecht = geschlecht;
        this.currentSemester = currentSemester;
        this.matrikelNummer = matrikelNummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public boolean advanceSemester() {
        if (currentSemester >= 6) {
            return false;
        }

        currentSemester++;
        return true;
    }

    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geschlecht=" + geschlecht +
                ", currentSemester=" + currentSemester +
                ", matrikelNummer=" + matrikelNummer +
                '}';
    }
}
