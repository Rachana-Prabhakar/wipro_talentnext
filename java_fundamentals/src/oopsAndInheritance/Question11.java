package oopsAndInheritance;

	import java.util.Optional;

	class InvalidEmployeeException extends RuntimeException {
	    public InvalidEmployeeException(String message) {
	        super(message);
	    }
	}

	class Employee {
	    String name;

	    Employee(String name) {
	        this.name = name;
	    }
	}

	public class Question11 {
	    public static void main(String[] args) {
	        // Case 1: Uncomment this to test successful case
	        Employee emp = new Employee("Rachana");


	        Optional<Employee> optionalEmp = Optional.ofNullable(emp);

	        Employee e = optionalEmp.orElseThrow(() -> new InvalidEmployeeException("Employee is invalid"));
	        System.out.println("Employee name: " + e.name);
	    }
	}

