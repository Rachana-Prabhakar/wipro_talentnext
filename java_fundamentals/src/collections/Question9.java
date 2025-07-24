package collections;

	import java.util.HashSet;
	import java.util.Iterator;

	public class Question9 {
	    public static void main(String[] args) {
	        HashSet<String> employees = new HashSet<>();
	        employees.add("Ravi");
	        employees.add("Meena");
	        employees.add("Asha");
	        employees.add("John");

	        Iterator<String> itr = employees.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	    }
	}


