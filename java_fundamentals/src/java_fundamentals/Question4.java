package java_fundamentals;

import java.util.Scanner;

public class Question4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
			if(num == 0) {
				System.out.print("Zero");
			}
			else if( num > 0) {
			System.out.println("positive");
		}
		else {
			System.out.print("negative");
		}
			 System.out.println("Enter first non-negative number.");
		        int num1 = sc.nextInt();
		        System.out.println("Enter second non- negative number.");
		        int num2 = sc.nextInt();
		        if(num1 < 0 || num < 0) {
		        	System.out.println("Enter Non-negative Numbers only");
		        }else {
		        	boolean sameLastDigit = (num1 % 10) == (num2 % 10);
		        	System.out.println("Same last digit: " + sameLastDigit);
		        }
		        sc.close();

		
	}

}
