import java.util.ArrayList;
import java.util.List;

// Abstract class representing an Employee
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract void displayDetails();
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    private double baseSalary;

    public FullTimeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // Fixed salary for full-time employees
    }

    @Override
    public void displayDetails() {
        System.out.println("Full-Time Employee: " + name);
        System.out.printf("Salary: $%.2f%n", calculateSalary());
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked; // Salary for part-time employees
    }

    @Override
    public void displayDetails() {
        System.out.println("Part-Time Employee: " + name);
        System.out.printf("Salary: $%.2f%n", calculateSalary());
    }
}

// Employee management system class
class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void displayAllEmployees() {
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("------------------------------");
        }
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create an instance of the EmployeeManagementSystem
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Create employees
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("Alice", 60000);
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("Bob", 20, 100);

        // Add employees to the system
        ems.addEmployee(fullTimeEmp);
        ems.addEmployee(partTimeEmp);

        // Display all employees
        ems.displayAllEmployees();
    }
}