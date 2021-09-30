package DataStrucures;

import java.util.Scanner;

class Array {
	public static void main(String[] args) {
		int[] priceOfPen = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < priceOfPen.length; i++)
			priceOfPen[i] = sc.nextInt();

		for (int i = 0; i < priceOfPen.length; i++)
			System.out.print(priceOfPen[i] + " ");
		sc.close();
	}
}
