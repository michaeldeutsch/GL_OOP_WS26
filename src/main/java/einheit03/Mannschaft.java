package einheit03;

import java.util.ArrayList;

public class Mannschaft {

    private String name;
    private ArrayList<Spieler> mannschaft;

    public Mannschaft(String name){
        this.name = name;
        this.mannschaft = new ArrayList<>();
    }

    @Override
    public String toString() {

        String anzahlSpieler = mannschaft.size() > 0 ? ", "+mannschaft.size():", Zum jetztigen Zeitpunkt sind keine Spieler zugebucht";



        return "Mannschaft{" +
                "name='" + name  + anzahlSpieler + "}";
    }

    public void anschreiben(Spieler spieler1) {
        mannschaft.add(spieler1);
    }

    public void zeigeMannschaft(){
        System.out.println("\nMannschaft: " + name);

        /*
        for(int i = 0; i < mannschaft.size(); i++){
            System.out.println(mannschaft.get(i));
        }


        for(Spieler spieler : mannschaft){
            System.out.println(spieler);

        }
*/
        mannschaft.forEach(System.out::println);


    }

}
