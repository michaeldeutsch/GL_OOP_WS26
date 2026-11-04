package einheit_04.uebung.uebung07;

public class Vogel extends Tier {
    private double fluegelspannweite;

    public Vogel(String name, int alter, String futter, double fluegelspannweite) {
        super(name, alter, futter);
        this.fluegelspannweite = fluegelspannweite;
    }

    public double getFluegelspannweite() {
        return fluegelspannweite;
    }

    @Override
    public void gibLaut() {
        System.out.println("Tschiep!");
    }

    @Override
    public String toString() {
        return "Vogel{" +
                "name='" + getName() + '\'' +
                ", alter=" + getAlter() +
                ", futter='" + getFutter() + '\'' +
                ", fluegelspannweite=" + fluegelspannweite +
                '}';
    }
}
