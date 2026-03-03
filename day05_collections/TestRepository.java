package day05_collections;

public class TestRepository {
    
    public static void main(String[] args) {
        PersonRepository repository = new PersonRepository();

        Person person1 = new Person(1, "Alice", 30);
        Person person2 = new Person(2, "Bob", 25);

        repository.save(person1);
        repository.save(person2);

        // READ
        System.out.println("Find by ID 1: " + repository.findById(1));
        System.out.println("Find by ID 2: " + repository.findById(2));

        // UPDATE
        person1.setName("Alice Smith");
        repository.update(person1);
        System.out.println("After update, find by ID 1: " + repository.findById(1));

        // READ ALL
        System.out.println("All persons in repository:");
        for (Person person : repository.findAll()) {
            System.out.println(person);        
        }

        // DELETE
        repository.delete(1);
        System.out.println("After deletion, find by ID 1: " + repository.findById(1));
    }
}
