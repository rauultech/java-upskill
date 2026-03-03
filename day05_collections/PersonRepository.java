package day05_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class PersonRepository {
    
    private Map<Integer, Person> storage = new HashMap<>();

    // CREATE
    public void save(Person person) {
        storage.put(person.getId(), person);
    }

    // READ
    public Person findById(int id) {
        return storage.get(id);
    }

    // UPDATE
    public void update(Person person) {
        if(storage.containsKey(person.getId())) {
            storage.put(person.getId(), person);
        } else {
            System.out.println("Person with ID " + person.getId() + " not found.");
        }
    }

    // READ ALL
    public Collection<Person> findAll() {
        return storage.values();
    }

    // DELETE
    public void delete(int id) {
        if(storage.containsKey(id)) {
            storage.remove(id);
        } else {
            System.out.println("Person with ID " + id + " not found.");     
        }
    }
}
