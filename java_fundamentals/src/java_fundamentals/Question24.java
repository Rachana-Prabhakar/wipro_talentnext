package java_fundamentals;

import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Question24 {
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
		Set<Integer> set = new LinkedHashSet<>();
		for(int num : arr) {
			set.add(num);
		}
		for(int num : set) {
			System.out.print(num + " ");
		}

}
}
