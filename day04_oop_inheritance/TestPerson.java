package day04_oop_inheritance;

public class TestPerson {
    public static void main(String[] args) {
        Address address = new Address("Main Street", "649101", "Calicut");
        Employee employee = new Employee(1, "John Doe", 34, address, "IT");
        System.out.println("Employee details: " + employee.getPersonDetails());

        Person person = new Employee(2, "Brad Pit", 22, address, "Mechanical");

        System.out.println("Person details: " + person.getPersonDetails());

    }
}
