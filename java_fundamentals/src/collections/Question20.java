package collections;


	interface PrimeChecker {
	    Question20 create(int number);
	}

	public class Question20 {
	    public Question20(int number) {
	        boolean isPrime = true;
	        if (number <= 1) isPrime = false;
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                isPrime = false;
	                break;
	            }
	        }
	        System.out.println(isPrime ? "Prime" : "Not Prime");
	    }

	    public static void main(String[] args) {
	        PrimeChecker checker = Question20::new;
	        checker.create(29);
	        checker.create(10);
	    }
	}


