package collections;

	import java.util.TreeSet;
	import java.util.Iterator;

	public class Question10 {
	    public static void main(String[] args) {
	        TreeSet<String> ts = new TreeSet<>();
	        ts.add("Banana");
	        ts.add("Apple");
	        ts.add("Mango");
	        ts.add("Pineapple");

	        Iterator<String> it = ts.descendingIterator();
	        while (it.hasNext()) {
	            System.out.println(it.next());
	        }

	        Iterator<String> it2 = ts.iterator();
	        while (it2.hasNext()) {
	            System.out.println(it2.next());
	        }

	        System.out.println(ts.contains("Mango"));
	        System.out.println(ts.contains("Orange"));
	    }
	

}
