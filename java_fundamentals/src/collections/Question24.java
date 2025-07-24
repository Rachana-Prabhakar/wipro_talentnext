package collections;

	import java.util.*;
	import java.util.function.Supplier;

public class Question24 {
	    public static void main(String[] args) {
	        Supplier<List<Integer>> primeSupplier = () -> {
	            List<Integer> primes = new ArrayList<>();
	            int num = 2;
	            while (primes.size() < 10) {
	                if (isPrime(num)) {
	                    primes.add(num);
	                }
	                num++;
	            }
	            return primes;
	        };

	        List<Integer> primeNumbers = primeSupplier.get();
	        System.out.println("First 10 Prime Numbers: " + primeNumbers);
	    }

	    private static boolean isPrime(int n) {
	        if (n <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(n); i++) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	}


