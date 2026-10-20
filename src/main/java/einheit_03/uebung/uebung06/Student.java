package einheit_03.uebung.uebung06;

public class Student {
    private final int matrikelNr;
    private final String name;

    public Student(int matrikelNr, String name) {
        this.matrikelNr = matrikelNr;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + matrikelNr + ")";
    }
}
