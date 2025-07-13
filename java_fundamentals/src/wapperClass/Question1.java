package wapperClass;
import java.util.Scanner;
public class Question1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number between 1 and 255: ");
	        int num = sc.nextInt();

	        if (num < 1 || num > 255) {
	            System.out.println("Error: Number must be between 1 and 255.");
	        } else {
	            String binary = Integer.toBinaryString(num);
	            // Pad with leading zeros to make it 8 digits
	            String paddedBinary = String.format("%8s", binary).replace(' ', '0');
	            System.out.println("Binary representation: " + paddedBinary);
	        }
	    }
	}


