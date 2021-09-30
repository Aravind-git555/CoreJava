package Exception;

import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
