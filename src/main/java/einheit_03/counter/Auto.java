package einheit_03.counter;

public class Auto {

    private static int counter = 1000; // Klassenvariable zur automatischen Nummernvergabe

    private final int kfzNr;
    private String name;

    public Auto(String name) {
        counter += 5;
        this.kfzNr = counter;
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public int getKfzNr() {
        return kfzNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "kfzNr=" + kfzNr +
                ", name='" + name + '\'' +
                '}';
    }
}
