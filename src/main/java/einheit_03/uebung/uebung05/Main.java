package einheit_03.uebung.uebung05;

public class Main {

    public static void main(String[] args) {
        Studiengang se = new Studiengang("Software Engineering", Abschluss.BACHELOR);

        Student s1 = new Student("Florian");
        Student s2 = new Student("Sabine");

        se.einschreiben(s1);
        se.einschreiben(s2);

        System.out.println(se);
        se.zeigeStudenten();

        System.out.println("\nStudentendetails:");
        System.out.println(s1);
        System.out.println(s2);
    }
}
