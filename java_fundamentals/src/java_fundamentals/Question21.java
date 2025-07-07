package java_fundamentals;
import java.util.Scanner;
public class Question21 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Size of array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int sum =0;
		for(int i =0;i<n;i++) {
			arr[i] = scanner.nextInt();
		 System.out.print(arr[i] + " ");
		 System.out.println();
		sum +=arr[i];
		
	}
		System.out.println(sum);
		double avg = sum/n;
		System.out.println(avg);
		
	}	
		
}