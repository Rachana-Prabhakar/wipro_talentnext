package collections;


	import java.util.Vector;
	import java.util.Iterator;
	import java.util.Enumeration;

	class Employeee{
	    int id;
	    String name;

	    Employeee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public String toString() {
	        return "ID: " + id + ", Name: " + name;
	    }
	}

	public class Question7 {
	    public static void main(String[] args) {
	        Vector<Employeee> empVector = new Vector<>();

	        empVector.add(new Employeee(101, "Alice"));
	        empVector.add(new Employeee(102, "Bob"));
	        empVector.add(new Employeee(103, "Charlie"));

	        System.out.println("Using Iterator:");
	        Iterator<Employeee> it = empVector.iterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        System.out.println("\nUsing Enumeration:");
	        Enumeration<Employeee> en = empVector.elements();
	        while (en.hasMoreElements()) {
	            System.out.println(en.nextElement());
	        }
	    }
	}


