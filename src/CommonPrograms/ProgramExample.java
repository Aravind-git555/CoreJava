package CommonPrograms;

import java.util.Scanner;

public class ProgramExample {

	static int n;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row/Coloumn");
		n = s.nextInt();
		int arr[][] = new int[n][n];

		System.out.println("Enter your matrix");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int k=arr.length-1,n3=0,n4=0;
		for(int i=0,j=0;i<arr.length;i++,j++) {
			n3=arr[i][j]+n3;
			n4=arr[k][j]+n4;
			k--;
		}
		
		System.out.println(n3+" "+n4+" "+(n3 - n4));
		s.close();
		//int n1 = result1(arr);
		//int n2 = result2(arr);

		//System.out.println(n1 - n2);
	}

	public static int result1(int arr[][]) {

		int result = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = count; j < arr.length;) {
				result = arr[i][j] + result;
				count++;
				break;
			}
		}
		System.out.println(result);
		return result;
	}

	public static int result2(int arr[][]) {

		int result = 0;
		int count = arr.length - 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = count; j < arr.length;) {
				result = arr[i][j] + result;
				count--;
				break;
			}
		}
		System.out.println(result);
		return result;
	}
}