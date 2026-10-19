package einheit_03.studiengang;

public class Main {

    public static void main(String[] args) {
        Studiengang pit = new Studiengang("PIT", Type.BACHELOR);
        System.out.println(pit);

        Student maxi = new Student(111, "Maxi", "Mouse");
        pit.addStudent(maxi); // STG -> Student
        maxi.addStudiengang(pit); // Student -> STG

        pit.showStudents();
        System.out.println(maxi);
    }
}
