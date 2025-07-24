package collections;
import java.util.*;
import java.util.stream.*;
public class Question18 {


	    public static void main(String[] args) {
	        ArrayList<String> al = new ArrayList<>();
	        al.add("apple");
	        al.add("banana");
	        al.add("cat");
	        al.add("dog");
	        al.add("elephant");
	        al.add("frog");
	        al.add("grape");
	        al.add("hat");
	        al.add("ice");
	        al.add("jungle");

	        al.forEach(s -> System.out.println(new StringBuilder(s).reverse().toString()));
	    }
	}


