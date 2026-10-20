package einheit_03.uebung.uebung04;

public class Main {

    public static void main(String[] args) {
        Team team = new Team("Rapid Kickers");

        Fussballer f1 = new Fussballer("Manuel", 32, Position.TORWART);
        Fussballer f2 = new Fussballer("David", 28, Position.ABWEHR);
        Fussballer f3 = new Fussballer("Luka", 24, Position.MITTFELD);
        Fussballer f4 = new Fussballer("Toni", 26, Position.MITTFELD);
        Fussballer f5 = new Fussballer("Erling", 22, Position.ANGRIFF);

        team.addSpieler(f1);
        team.addSpieler(f2);
        team.addSpieler(f3);
        team.addSpieler(f4);
        team.addSpieler(f5);

        team.zeigeSpielerAufPosition(Position.MITTFELD);
        team.zeigeSpielerAufPosition(Position.TORWART);
    }
}
