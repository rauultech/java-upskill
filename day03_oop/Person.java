package day03_oop;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getPersonDetails() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address.getFullAddress();
    }
}
