package Java8;

import java.util.Arrays;
import java.util.List;

public class MethodRefference {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
		l.forEach(System.out::println);
		A a=new A();

	}
}


class A{
	public void hello() {
		System.out.println("Hello");
	}
}
