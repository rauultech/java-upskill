package day07_mini_project_console;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {

    private EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public List<Employee> getEmployeesByDepartment(String department) {
        return employeeRepository.findAllEmployees().stream()
            .filter(e -> e.getDepartment().equalsIgnoreCase(department))
            .collect(Collectors.toList());
    }
    public List<Employee> getEmployeesWithSalaryAbove(double salary) {
        return employeeRepository.findAllEmployees().stream()
            .filter(e -> e.getSalary() > salary)
            .collect(Collectors.toList());
    }
    
}
