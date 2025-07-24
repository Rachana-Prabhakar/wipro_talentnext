package collections;


	import java.util.ArrayList;
	import java.util.Iterator;

	public class Question3 {
	    ArrayList<String> stringList = new ArrayList<>();

	    public void addStrings() {
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Cherry");
	        stringList.add("Mango");
	    }

	    public void printAll() {
	        Iterator<String> iterator = stringList.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

	    public static void main(String[] args) {
	        Question3 example = new Question3();
	        example.addStrings();
	        System.out.println("Printing all strings in the ArrayList:");
	        example.printAll();
	    }
	}

