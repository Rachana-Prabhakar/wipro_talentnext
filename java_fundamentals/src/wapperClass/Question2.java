package wapperClass;
import java.util.Scanner;
public class Question2 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        try {
	            int number = scanner.nextInt();

	            System.out.println("Given Number: " + number);
	            System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
	            System.out.println("Octal equivalent: " + Integer.toOctalString(number));
	            System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number).toUpperCase());

	        } catch (Exception e) {
	            System.out.println("Invalid input. Please enter a valid integer.");
	        } finally {
	            scanner.close();
	        }
	    }
	}


