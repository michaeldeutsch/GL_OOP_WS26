package einheit_04.vererbung;

public class Tier extends Lebewesen{

    private String futter;

    Tier(String name, int alter, String futter){
        super(name, alter);
        this.futter = futter;
    }

    @Override
    public String toString() {
        return "Tier{" +
                "name='" + super.getName()+ '\'' +
                ", alter=" + super.getAlter() +
                ", futter='" + futter + '\'' +
                '}';
    }

    public String getFutter() {
        return futter;
    }
}
