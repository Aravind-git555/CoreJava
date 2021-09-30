package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {

	/*
	 * public static void main(String[] args) { List<String> list =
	 * Arrays.asList("Aravind", "Arun", "Muth", "Eswar"); List<String> l =
	 * list.stream().map(x -> x + x).collect(Collectors.toList()); l.forEach(i ->
	 * System.out.println(i)); }
	 */

	/*
	 * public static void main(String[] args) { List<String>
	 * list=Arrays.asList("Aravind","Arun","muthu"); List<String>
	 * l=list.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
	 * l.forEach(i -> System.out.println(i)); }
	 */

	public static void main(String[] args) {
		List<String> list=Arrays.asList("muthu","Arun","Bala");
		List<String> l=list.stream().sorted().collect(Collectors.toList());
		l.forEach(i -> System.out.println(i));
	
}
}