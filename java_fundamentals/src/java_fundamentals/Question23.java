package java_fundamentals;
import java.util.Scanner;
public class Question23 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		System.out.print("The Array: ");
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the number to find: ");
		int num = sc.nextInt();
		for(int i =0;i<n;i++) {
			if(arr[i]==num) {
			System.out.println(i);
			break;
			}
		
			if(arr[i]!=num) {
			System.out.println("-1");
			}
		
		}
			
		}
	}


