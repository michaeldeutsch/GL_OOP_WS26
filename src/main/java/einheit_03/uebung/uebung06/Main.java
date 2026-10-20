package einheit_03.uebung.uebung06;

public class Main {

    public static void main(String[] args) {
        Kurs kurs = new Kurs("Programmieren 1", 2);

        Student s1 = new Student(101, "Lukas");
        Student s2 = new Student(102, "Sophie");
        Student s3 = new Student(103, "Maximilian");

        System.out.println("Anmeldung s1: " + kurs.anmelden(s1));
        System.out.println("Anmeldung s1 erneut: " + kurs.anmelden(s1));
        System.out.println("Anmeldung s2: " + kurs.anmelden(s2));
        System.out.println("Anmeldung s3 (überfüllt): " + kurs.anmelden(s3));

        System.out.println("\nKursübersicht:");
        System.out.println(kurs);
    }
}
