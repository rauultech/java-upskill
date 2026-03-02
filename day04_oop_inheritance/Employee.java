package day04_oop_inheritance;

public class Employee extends Person {

    private String departmeent;

    public Employee(int id, String name, int age, Address address, String department) {
        super(id, name, age, address);
        this.departmeent = department;
    }

    @Override
    public String getPersonDetails() {
        return super.getPersonDetails() + ", Department: " + departmeent;
    }
    
}
