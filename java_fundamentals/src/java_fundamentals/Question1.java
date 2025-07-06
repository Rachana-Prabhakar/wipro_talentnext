package java_fundamentals;
import java.util.Scanner;
public class Question1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in) ;
			String company = scanner.nextLine();
			String location =scanner.nextLine();
			System.out.println(company + " Tecnologies " +location);
		scanner.close();
	}

}
