package oopsAndInheritance;


	public class Sample16 {
	    public static void main(String[] args) {
	        try {
	            if (args.length != 5) {
	                throw new IllegalArgumentException("Exactly 5 integers are required.");
	            }

	            int[] numbers = new int[5];
	            int sum = 0;
	            for (int i = 0; i < 5; i++) {
	                numbers[i] = Integer.parseInt(args[i]);  // May throw NumberFormatException
	                sum += numbers[i];
	            }

	            double average = sum / 5.0;
	            System.out.println("Sum: " + sum);
	            System.out.println("Average: " + average);

	        } catch (NumberFormatException e) {
	            System.out.println("NumberFormatException: Please enter valid integers.");
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException: " + e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.out.println("IllegalArgumentException: " + e.getMessage());
	        }
	    }
	}


