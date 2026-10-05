package einheit_01.uebung;

public class Uebung04 {
    public static void main(String[] args) {
        Student student = new Student(5);
        student.advanceSemester();
        System.out.println(student.getSemester());

        student.advanceSemester();
        System.out.println(student.getSemester());
    }

    private static class Student {
        private int semester;

        private Student(int semester) {
            this.semester = semester;
        }

        private void advanceSemester() {
            if (semester < 6) {
                semester++;
            }
        }

        private int getSemester() {
            return semester;
        }
    }
}
