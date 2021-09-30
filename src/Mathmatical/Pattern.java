package Mathmatical;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) { // how many times
			for (int j = n; j >= 1; j--) { // 3,2,1 //what to print
				int k = i;
				while (k >= 1) { // 
					System.out.print(j+" ");
					--k;
				}
			}
			System.out.print("$");
		}
		sc.close();

	}
}
