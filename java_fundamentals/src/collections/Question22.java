package collections;


	import java.util.*;
	import java.util.function.Predicate;

	public class Question22 {
	    public static void main(String[] args) {
	        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
	            0, 1, 2, 3, 4, 5, 6, 9, 16, 18, 20, 25, 27, 36, 40, 49, 64, 81
	        ));

	        Predicate<Integer> isPerfectSquare = n -> Math.sqrt(n) % 1 == 0;

	        numbers.stream()
	            .filter(isPerfectSquare)
	            .forEach(System.out::println);
	    }
	}


