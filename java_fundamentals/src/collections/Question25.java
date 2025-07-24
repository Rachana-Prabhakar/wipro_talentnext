package collections;

	import java.time.Year;
	public class Question25 {
	    public static void main(String[] args) {
	        int currentYear = Year.now().getValue();

	        if ((currentYear % 4 == 0 && currentYear % 100 != 0) || (currentYear % 400 == 0)) {
	            System.out.println(currentYear + " is a Leap Year");
	        } else {
	            System.out.println(currentYear + " is Not a Leap Year");
	        }
	    }
	}


