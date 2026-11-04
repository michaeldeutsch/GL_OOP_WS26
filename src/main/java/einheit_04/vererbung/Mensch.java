package einheit_04.vererbung;

public class Mensch extends  Lebewesen{

    String adresse;

    Mensch(String name, int alter, String adresse){
        super(name, alter);
        this.adresse = adresse;
    }


    public String getAdress() {
        return adresse;
    }
}
