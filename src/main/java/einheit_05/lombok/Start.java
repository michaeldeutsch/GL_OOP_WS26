package einheit_05.lombok;

public class Start {

    public static void main(String[] args) {

        Person person = new Person(25, "John", "Wien", 1010);
        System.out.println("Initial: " + person);

        person.setAge(30);
        person.setAdresse("Graz");
        person.setPlz(8010);
        System.out.println("Nach Änderung (Getter/Setter): " + person);
        System.out.println("Name: " + person.getName() + ", Alter: " + person.getAge());
    }
}
