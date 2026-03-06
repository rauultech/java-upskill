package day07_mini_project_console;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
    public static List<Employee> getEmployees() {
        return List.of(
            new Employee("Rahul Mohan", "Engineering", 75000, "rahul.mohan@company.com", "9876543210", "India"),
            new Employee("John Carter", "Human Resources", 62000, "john.carter@company.com", "9876543211", "USA"),
            new Employee("Emily Stone", "Marketing", 68000, "emily.stone@company.com", "9876543212", "UK"),
            new Employee("Michael Brown", "Finance", 72000, "michael.brown@company.com", "9876543213", "Canada"),
            new Employee("Sophia Wilson", "Engineering", 80000, "sophia.wilson@company.com", "9876543214", "Australia"),
            new Employee("Daniel Lee", "Engineering", 71000, "daniel.lee@company.com", "9876543215", "Singapore"),
            new Employee("Olivia Taylor", "Sales", 65000, "olivia.taylor@company.com", "9876543216", "Germany"),
            new Employee("James Anderson", "Support", 60000, "james.anderson@company.com", "9876543217", "India"),
            new Employee("Isabella Martinez", "Marketing", 67000, "isabella.martinez@company.com", "9876543218", "Spain"),
            new Employee("William Thomas", "Finance", 73000, "william.thomas@company.com", "9876543219", "USA")
        );
    }

    private int idSequence = -1; // Starting ID for new employees

    private Map<Integer, Employee> storage = new HashMap<>();

    private void saveInitialEmployees() {
        getEmployees().forEach(employee -> {
            employee.setId(idSequence++);
            storage.put(employee.getId(), employee);
        });
    }

    EmployeeRepository() {
        saveInitialEmployees();
    }

    public void saveEmployee(Employee employee) {
        employee.setId(idSequence++);
        storage.put(employee.getId(), employee);
    }

    public Employee findEmployeeById(int id) {
        return storage.get(id);
    }

    public void updateEmployee(Employee employee) {
        if(storage.containsKey(employee.getId())) {
            storage.put(employee.getId(), employee);
        } else {
            System.out.println("Employee with ID " + employee.getId() + " not found.");        
        }
    }

    public List<Employee> findAllEmployees() {
        return List.copyOf(storage.values());
    }

    public void deleteEmployee(int id) {
        if(storage.containsKey(id)) {
            storage.remove(id);
        } else {
            System.out.println("Employee with ID " + id + " not found.");        
        }
    }
}
