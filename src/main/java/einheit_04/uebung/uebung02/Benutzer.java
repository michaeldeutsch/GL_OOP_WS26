package einheit_04.uebung.uebung02;

import java.util.ArrayList;

public class Benutzer {
    private static int COUNTER = 1;
    private static ArrayList<String> ALL_USERNAMES = new ArrayList<>();
    private static final String DEFAULT_NAME = "gast";

    private final int id;
    private String username;
    private String email;

    public Benutzer(String username, String email) {
        if (ALL_USERNAMES.contains(username)) {
            System.err.println("Username '" + username + "' bereits vergeben!");
            this.username = DEFAULT_NAME;
        } else {
            this.username = username;
            ALL_USERNAMES.add(username);
        }
        this.id = COUNTER++;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Benutzer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
