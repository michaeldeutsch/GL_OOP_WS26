package einheit_04.uebung.uebung07;

public class Hund extends Tier {
    private String rasse;

    public Hund(String name, int alter, String futter, String rasse) {
        super(name, alter, futter);
        this.rasse = rasse;
    }

    public String getRasse() {
        return rasse;
    }

    @Override
    public void gibLaut() {
        System.out.println("Wau! Wau!");
    }

    @Override
    public String toString() {
        return "Hund{" +
                "name='" + getName() + '\'' +
                ", alter=" + getAlter() +
                ", futter='" + getFutter() + '\'' +
                ", rasse='" + rasse + '\'' +
                '}';
    }
}
