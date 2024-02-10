import java.util.Scanner;

public class employee {

    public static class Employee {
        String name;
        int age;
        double salary;
        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: $" + salary);
            System.out.println("---------------------");
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John Doe", 30, 50000.0);
        employees[1] = new Employee("Jane Smith", 25, 60000.0);
        employees[2] = new Employee("Bob Johnson", 35, 75000.0);
        for (Employee employee : employees) {
            employee.displayDetails();
        }
    }
}
