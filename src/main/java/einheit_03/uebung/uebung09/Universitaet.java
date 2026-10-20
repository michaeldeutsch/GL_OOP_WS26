package einheit_03.uebung.uebung09;

import java.util.ArrayList;

public class Universitaet {
    private final String name;
    private final ArrayList<Fakultaet> fakultaeten;

    public Universitaet(String name) {
        this.name = name;
        this.fakultaeten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFakultaet(Fakultaet fakultaet) {
        if (fakultaet != null && !fakultaeten.contains(fakultaet)) {
            fakultaeten.add(fakultaet);
        }
    }

    public int getGesamtAnzahlProfessoren() {
        int gesamt = 0;
        for (Fakultaet f : fakultaeten) {
            gesamt += f.getProfessoren().size();
        }
        return gesamt;
    }

    public ArrayList<Professor> sucheProfessorenNachFachgebiet(String fachgebiet) {
        ArrayList<Professor> treffer = new ArrayList<>();
        for (Fakultaet f : fakultaeten) {
            for (Professor p : f.getProfessoren()) {
                if (p.getFachgebiet().equalsIgnoreCase(fachgebiet)) {
                    treffer.add(p);
                }
            }
        }
        return treffer;
    }
}
