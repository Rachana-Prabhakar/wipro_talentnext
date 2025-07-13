package oopsAndInheritance;
import java.util.ArrayList;
import java.util.StringJoiner;
public class Sample9 {
	    public static void main(String[] args) {
	        ArrayList<String> names = new ArrayList<>();
	        names.add("Rachana");
	        names.add("Ruchitha");
	        names.add("Vedika");

	        StringJoiner joiner = new StringJoiner(", ", "{", "}");
	        for (String name : names) {
	            joiner.add(name);
	        }

	        System.out.println(joiner.toString());  // Output: {Alice, Bob, Charlie}
	    }
	}

