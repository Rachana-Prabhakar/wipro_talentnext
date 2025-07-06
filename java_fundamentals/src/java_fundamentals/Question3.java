package java_fundamentals;

import java.util.Scanner;

public class Question3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2: ");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("The Sum of "+ num1 +" and " + num2+ " is " +sum);
		sc.close();
		

}
}
