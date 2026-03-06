package day07_mini_project_console;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Initialize repository which acts as the in-memory data store
        EmployeeRepository repoitory = new EmployeeRepository();

        // Initialize service layer with repository dependency
        EmployeeService service = new EmployeeService(repoitory);

        // Fetch employees belonging to IT department
        List<Employee> itEmployees = service.getEmployeesByDepartment("Engineering");
        System.out.println("Engineering Employees:");
        itEmployees.forEach(System.out::println);

        // Fetch employees whose salary is greater than 50000
        List<Employee> highEarners = service.getEmployeesWithSalaryAbove(50000);
        System.out.println("\nEmployees with Salary Above 50000:");
        highEarners.forEach(System.out::println);

        // Retrieve and print all employees from repository
        List<Employee> allEmployees = repoitory.findAllEmployees();
        System.out.println("\nAll Employees:");
        allEmployees.forEach(System.out::println);

        // Create and save a new employee
        Employee newEmployee = new Employee("Alice Johnson", "IT", 85000, "alice.johnson@example.com", "9876543210", "USA");
        repoitory.saveEmployee(newEmployee);

        // Fetch employee by id after saving
        Employee foundEmployee = repoitory.findEmployeeById(newEmployee.getId());
        System.out.println("\nFound Employee:");
        System.out.println(foundEmployee);

        // Delete employee using id
        repoitory.deleteEmployee(newEmployee.getId());

        // Try fetching deleted employee (should return null)
        Employee deletedEmployee = repoitory.findEmployeeById(newEmployee.getId());
        System.out.println("\nDeleted Employee (should be null):");
        System.out.println(deletedEmployee);

        // Retrieve employee and update salary
        Employee employeeToUpdate = repoitory.findEmployeeById(1);
        if(employeeToUpdate != null) {
            employeeToUpdate.setSalary(90000);
            repoitory.updateEmployee(employeeToUpdate);
        }

        // Fetch updated employee to verify salary change
        Employee updatedEmployee = repoitory.findEmployeeById(1);
        System.out.println("\nUpdated Employee:");
        System.out.println(updatedEmployee);
    }
}