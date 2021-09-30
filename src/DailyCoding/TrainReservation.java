package DailyCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrainReservation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List trainList = Arrays.asList("Thirunelveli", "Chennai", "Bangalore", "Tirichi");
		System.out.println("Available Trains");
		trainList.forEach(e -> System.out.print(e+" "));
		System.out.println();
		System.out.println("Enter the train no");
		int t=sc.nextInt();
		System.out.println(trainList.get(t));
	}
}
