package einheit_04.vererbung;

public class Lebewesen {

    private String name;
    private int alter;

   Lebewesen(String name, int alter){
    this.name = name;
    this.alter = alter;
   }

    @Override
    public String toString() {
        return "Lebewesen{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }

    public int getAlter() {
        return alter;
    }

    public String getName() {
        return name;
    }
}
