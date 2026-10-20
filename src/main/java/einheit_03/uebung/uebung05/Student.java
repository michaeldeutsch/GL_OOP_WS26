package einheit_03.uebung.uebung05;

public class Student {
    private static int counter = 2000;

    private final int matrikelNr;
    private final String name;
    private Studiengang studiengang;

    public Student(String name) {
        counter++;
        this.matrikelNr = counter;
        this.name = name;
    }

    public int getMatrikelNr() {
        return matrikelNr;
    }

    public String getName() {
        return name;
    }

    public void setStudiengang(Studiengang studiengang) {
        this.studiengang = studiengang;
    }

    @Override
    public String toString() {
        String stgName = (studiengang != null) ? studiengang.getBezeichnung() : "keiner";
        return "Student{matrikelNr=" + matrikelNr + ", name='" + name + "', studiengang=" + stgName + "}";
    }
}
