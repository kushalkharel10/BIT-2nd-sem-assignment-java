abstract class Employee {
    protected String name;
    protected String id;
    
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    // Abstract method (must be implemented by subclasses)
    public abstract double calculateSalary();
    
    // Common method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

interface TaxPayer {
    double calculateTax();
}

class Manager extends Employee implements TaxPayer {
    private double bonus;
    
    public Manager(String name, String id, double bonus) {
        super(name, id);
        this.bonus = bonus;
    }
    
    @Override
    public double calculateSalary() {
        return 50000 + bonus; // Base salary + bonus
    }
    
    @Override
    public double calculateTax() {
        return calculateSalary() * 0.25; // 25% tax
    }
}

class Developer extends Employee {
    private int overtimeHours;
    
    public Developer(String name, String id, int overtime) {
        super(name, id);
        this.overtimeHours = overtime;
    }
    
    @Override
    public double calculateSalary() {
        return 40000 + (overtimeHours * 50); // Base + overtime pay
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        // Polymorphism in action
        Employee emp1 = new Manager("John Doe", "M001", 10000);
        Employee emp2 = new Developer("Jane Smith", "D001", 20);
        
        // Upcasting and method overriding
        emp1.displayInfo();
        System.out.println("Salary: $" + emp1.calculateSalary());
        
        emp2.displayInfo();
        System.out.println("Salary: $" + emp2.calculateSalary());
        
        // Interface usage
        if (emp1 instanceof TaxPayer) {
            TaxPayer taxpayer = (TaxPayer) emp1; // Downcasting
            System.out.println("Tax: $" + taxpayer.calculateTax());
        }
    }
}
