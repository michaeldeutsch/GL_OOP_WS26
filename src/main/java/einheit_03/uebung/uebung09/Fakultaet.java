package einheit_03.uebung.uebung09;

import java.util.ArrayList;

public class Fakultaet {
    private final String name;
    private final ArrayList<Professor> professoren;

    public Fakultaet(String name) {
        this.name = name;
        this.professoren = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Professor> getProfessoren() {
        return professoren;
    }

    public void addProfessor(Professor prof) {
        if (prof != null && !professoren.contains(prof)) {
            professoren.add(prof);
        }
    }
}
