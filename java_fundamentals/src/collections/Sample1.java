package collections;

	import java.util.*;
	import java.util.stream.*;
	public class Sample1 {
	    public static void main(String[] args) {
	        ArrayList<Integer> al = new ArrayList<>();
	        Random rand = new Random();
	        for (int i = 0; i < 25; i++) {
	            al.add(rand.nextInt(100) + 1);
	        }

	        al.stream().filter(n -> {
	            if (n <= 1) return false;
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) return false;
	            }
	            return true;
	        }).forEach(System.out::println);
	    }
	}


