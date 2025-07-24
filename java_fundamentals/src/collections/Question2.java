package collections;


	import java.util.ArrayList;

	class Employee {
	    int empId;
	    String empName;
	    String email;
	    String gender;
	    float salary;

	    public Employee(int empId, String empName, String email, String gender, float salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.email = email;
	        this.gender = gender;
	        this.salary = salary;
	    }

	    public void getEmployeeDetails() {
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Name: " + empName);
	        System.out.println("Email: " + email);
	        System.out.println("Gender: " + gender);
	        System.out.println("Salary: ₹" + salary);
	    }
	}

	class EmployeeDB {
	    ArrayList<Employee> list = new ArrayList<>();

	    public boolean addEmployee(Employee e) {
	        return list.add(e);
	    }

	    public boolean deleteEmployee(int empId) {
	        for (Employee e : list) {
	            if (e.empId == empId) {
	                list.remove(e);
	                return true;
	            }
	        }
	        return false;
	    }

	    public String showPaySlip(int empId) {
	        for (Employee e : list) {
	            if (e.empId == empId) {
	                return "PaySlip for " + e.empName + " [₹" + e.salary + "]";
	            }
	        }
	        return "Employee not found.";
	    }
	}

	public class Question2 {
	    public static void main(String[] args) {
	        Employee e1 = new Employee(101, "Ravi", "ravi@example.com", "Male", 50000);
	        Employee e2 = new Employee(102, "Anjali", "anjali@example.com", "Female", 60000);

	        EmployeeDB db = new EmployeeDB();

	        db.addEmployee(e1);
	        db.addEmployee(e2);

	        System.out.println("=== Employee Details ===");
	        e1.getEmployeeDetails();
	        System.out.println();
	        e2.getEmployeeDetails();

	        System.out.println("\n=== Payslip ===");
	        System.out.println(db.showPaySlip(102));

	        System.out.println("\nDeleting Employee with ID 101...");
	        db.deleteEmployee(101);

	        System.out.println("\n=== Updated Payslip Check ===");
	        System.out.println(db.showPaySlip(101));
	    }
	}


