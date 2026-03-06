package day07_mini_project_console;

public class Employee {
    private int id;
    private String name;
    private String department; 
    private double salary;
    private String email;
    private String phoneNumber;
    private String address;
    public Employee(String name, String department, double salary, String email, String phoneNumber, String address) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{id=" + id +
            ", name='" + name + '\'' +
            ", department='" + department + '\'' +
            ", salary=" + salary +
            '}';
    }
}
