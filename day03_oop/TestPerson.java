package day03_oop;

public class TestPerson {
    public static void main(String[] args) {
        Address address = new Address("Main Street", "671003", "Calicut");
        Person person = new Person("John Doe", 25, address);
        System.out.println(person.getPersonDetails());
    }
}
