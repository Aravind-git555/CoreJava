package Concepts;

public class Singleton {
	// Example obj2 = Example.getInstance();
	public static void main(String[] args) {
		Example obj1 = Example.getInstance();
		Example obj2 = Example.getInstance();
		obj1.hello();
		obj1.i = 1;
		System.out.println(obj2.i);
		obj1.i = 2;
		System.out.println(obj2.i);

	}
}

class Example {
	private Example() {

	}

	int i=0;
	static Example obj = new Example();

	static Example getInstance() {
		return obj;
	}

	public void hello() {
		System.out.println("Hi");
	}
}
