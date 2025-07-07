package java_fundamentals;
import java.util.Scanner;
public class Question22 {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array:");
	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i =0;i<n;i++) {
		arr[i]=sc.nextInt();
		System.out.println(arr[i]+" ");
	}
		int min = arr[0];
		int max = arr[0];
		for(int i =0;i<n;i++){
		if(arr[i]<min) {
			min = arr[i];
			System.out.println("Min value:"+min);
		
		}
		if(arr[i]>max) {
			max = arr[i];
			System.out.println("Max value:"+max);
		}
		
	}
	
}
}
