package collections;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Collectors;

	class Student {
	    int rollNo;
	    String name;
	    int mark;

	    public Student(int rollNo, String name, int mark) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.mark = mark;
	    }

	    @Override
	    public String toString() {
	        return "Roll No: " + rollNo + ", Name: " + name + ", Mark: " + mark;
	    }
	}

	public class Question21 {
	    public static void main(String[] args) {
	        ArrayList<Student> students = new ArrayList<>();
	        students.add(new Student(101, "Ravi", 65));
	        students.add(new Student(102, "Sneha", 45));
	        students.add(new Student(103, "Amit", 78));
	        students.add(new Student(104, "Priya", 49));
	        students.add(new Student(105, "Kiran", 88));

	        List<Student> passedStudents = students.stream()
	                .filter(s -> s.mark >= 50)
	                .collect(Collectors.toList());

	        System.out.println("Number of students who cleared the test: " + passedStudents.size());
	        System.out.println("Students who passed:");
	        for (Student s : passedStudents) {
	            System.out.println(s);
	        }
	    }
	}


