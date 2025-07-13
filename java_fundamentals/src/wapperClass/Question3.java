package wapperClass;
class Employee implements Cloneable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSalary(double salary) { this.salary = salary; }

    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported");
        }
    }

    public String toString() {
        return "Employee [ID = " + id + ", Name = " + name + ", Salary = " + salary + "]";
    }
}

public class Question3 {
    public static void main(String[] args) {
        Employee original = new Employee(101, "Rachana", 50000);
        Employee cloned = original.clone();
        original.setName("Jyothi");
        original.setSalary(60000);
        System.out.println("Original Employee: " + original);
        System.out.println("Cloned Employee:   " + cloned);
    }
}
