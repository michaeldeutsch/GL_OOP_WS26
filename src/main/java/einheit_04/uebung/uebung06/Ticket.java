package einheit_04.uebung.uebung06;

import java.util.ArrayList;

public class Ticket {
    private static ArrayList<String> ALL_CODES = new ArrayList<>();

    private String code;
    private double basispreis;

    public Ticket(String code, double basispreis) {
        if (ALL_CODES.contains(code)) {
            System.err.println("Ticket-Code '" + code + "' existiert bereits!");
            this.code = "INVALID";
        } else {
            this.code = code;
            ALL_CODES.add(code);
        }
        this.basispreis = basispreis;
    }

    public String getCode() {
        return code;
    }

    public double getBasispreis() {
        return basispreis;
    }

    public double getEndpreis() {
        return basispreis;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "code='" + code + '\'' +
                ", basispreis=" + basispreis +
                ", endpreis=" + getEndpreis() +
                '}';
    }
}
