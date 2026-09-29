package einheit_01.uebung1;

public class Uebung06 {
    public static void main(String[] args) {
        Student mina = new Student("Mina", 2);
        Student noah = new Student("Noah", 4);

        mina.advanceSemester();

        System.out.println(mina);
        System.out.println(noah);
    }

    private static class Student {
        private final String vorname;
        private int semester;

        private Student(String vorname, int semester) {
            this.vorname = vorname;
            this.semester = semester;
        }

        private void advanceSemester() {
            if (semester < 6) {
                semester++;
            }
        }

        @Override
        public String toString() {
            return vorname + " (Semester " + semester + ')';
        }
    }
}
