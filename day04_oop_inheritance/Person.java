package day04_oop_inheritance;

public class Person implements Identifiable {
    private int id;
    private String name;
    private int age;
    private Address address;

    public Person(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getPersonDetails() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address.getFullAddress();
    }

    @Override
    public Number getId() {
        return this.id;
    }
}
