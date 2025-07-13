package oopsAndInheritance;
import java.util.StringJoiner;
public class Question10 {
	    public static void main(String[] args) {
	        StringJoiner s1 = new StringJoiner("-", "[", "]");
	        s1.add("Delhi");
	        s1.add("Mumbai");

	        StringJoiner s2 = new StringJoiner("-", "[", "]");
	        s2.add("Hyderabad");
	        s2.add("Chennai");

	        StringJoiner merge1 = new StringJoiner("-", "[", "]");
	        merge1.merge(s2);
	        merge1.merge(s1);
	        System.out.println("s1 merged to s2: " + merge1);  // Output: [Hyderabad-Chennai-Delhi-Mumbai]

	        StringJoiner merge2 = new StringJoiner("-", "[", "]");
	        merge2.merge(s1);
	        merge2.merge(s2);
	        System.out.println("s2 merged to s1: " + merge2);  // Output: [Delhi-Mumbai-Hyderabad-Chennai]
	    }
	}


