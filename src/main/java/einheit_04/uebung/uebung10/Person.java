package einheit_04.uebung.uebung10;

import java.util.ArrayList;

public class Person {
    private static int ID_COUNTER = 1;
    private static ArrayList<String> ALL_EMAILS = new ArrayList<>();

    private final int id;
    private String name;
    private String email;

    public Person(String name, String email) {
        this.id = ID_COUNTER++;
        this.name = name;
        if (ALL_EMAILS.contains(email)) {
            System.err.println("E-Mail '" + email + "' ist bereits vergeben!");
            this.email = "duplicate@schule.at";
        } else {
            this.email = email;
            ALL_EMAILS.add(email);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
