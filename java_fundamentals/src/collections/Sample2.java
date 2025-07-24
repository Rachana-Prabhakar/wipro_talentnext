package collections;
import java.util.*;
public class Sample2 {
	

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

	        al.stream().filter(s -> s.length() % 2 != 0).forEach(System.out::println);
	    }
	

}
