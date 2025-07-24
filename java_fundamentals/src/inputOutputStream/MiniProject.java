package inputOutputStream;
import java.io.*;
import java.util.*;

public class MiniProject {
    static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    System.out.println("Exiting the application...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2 or 3.");
            }
        }
    }

    // Method to add employee
    public static void addEmployee(Scanner sc) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true));

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Employee Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            writer.write(id + "," + name + "," + age + "," + salary);
            writer.newLine();
            writer.close();

            System.out.println("Employee added successfully!");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static void displayEmployees() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            System.out.println("\n--- Employee Records ---");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Age: " + data[2] + ", Salary: ₹" + data[3]);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No employee records found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

