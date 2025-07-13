package oopsAndInheritance;
import java.util.Scanner;
public class Question9 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        System.out.print("Enter an integer n: ");
	        int n = sc.nextInt();

	        if (n < 0 || n > str.length()) {
	            System.out.println("Invalid input: n must be between 0 and length of string.");
	            return;
	        }

	        String lastNChars = str.substring(str.length() - n);

	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(lastNChars);
	        }

	        System.out.println("Output: " + result.toString());
	    }
	}


