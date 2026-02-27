import java.util.Scanner;

// Custom Exception Class
class InvalidDataException extends Exception {
    InvalidDataException(String message) {
        super(message);
    }
}

// Main Class
public class EmployeeData {

    // Employee class
    static class Employee {
        String name;
        int age;
        float salary;

        Employee(String name, int age, float salary) throws InvalidDataException {

            if (age <= 5) {
                throw new InvalidDataException("Age must be greater than 5.");
            }

            if (salary <= 0) {
                throw new InvalidDataException("Salary must be greater than 0.");
            }

            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();

            // Creating Employee object
            Employee emp = new Employee(name, age, salary);

            System.out.println("Data inserted successfully");

        } catch (InvalidDataException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
