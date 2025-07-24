package collections;


	import java.util.*;
	import java.util.function.Consumer;

	public class Question23 {
	    public static void main(String[] args) {
	        List<Integer> numbers = Arrays.asList(2, 5, 8, 9, 11, 14, 17, 20, 23, 24);

	        Consumer<Integer> checkOddEven = number -> {
	            if (number % 2 == 0) {
	                System.out.println(number + " even");
	            } else {
	                System.out.println(number + " odd");
	            }
	        };

	        numbers.forEach(checkOddEven);
	    }
	}



