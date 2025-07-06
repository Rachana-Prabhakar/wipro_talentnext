package java_fundamentals;
import java.util.Scanner;

public class Question2 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter name:");
	String name = sc.nextLine();
	System.out.println("welcome "+name);
	sc.close();
}
}
