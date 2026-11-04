package einheit_04.unqiue;

import java.util.ArrayList;

public class Mitarbeiter {

    private static int COUNTER = 1000;
    private static ArrayList<String> ALL_NAMES = new ArrayList<>();
    private static final String DEFAULT_NAME = "dummy";

    private final int mitarbeiterID;
    private String name;
    private int alter;

    public Mitarbeiter(String name, int alter) {

        if(ALL_NAMES.contains(name)){
            this.name = DEFAULT_NAME ;
            System.err.println(name + " bereits vorhanden");
        }
        else{
            this.name = name;
            ALL_NAMES.add(name);
        }

        this.mitarbeiterID = COUNTER++;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" +
                "mitarbeiterID=" + mitarbeiterID +
                ", name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
