package day05_collections;

public class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    int getId() {
        return this.id;
    }

    void setName(String newName) {
        this.name = newName;
    }
}
