package einheit_04.uebung.uebung07;

public class Katze extends Tier {
    private boolean kratzbaumLiebhaber;

    public Katze(String name, int alter, String futter, boolean kratzbaumLiebhaber) {
        super(name, alter, futter);
        this.kratzbaumLiebhaber = kratzbaumLiebhaber;
    }

    public boolean isKratzbaumLiebhaber() {
        return kratzbaumLiebhaber;
    }

    @Override
    public void gibLaut() {
        System.out.println("Miau!");
    }

    @Override
    public String toString() {
        return "Katze{" +
                "name='" + getName() + '\'' +
                ", alter=" + getAlter() +
                ", futter='" + getFutter() + '\'' +
                ", kratzbaumLiebhaber=" + kratzbaumLiebhaber +
                '}';
    }
}
