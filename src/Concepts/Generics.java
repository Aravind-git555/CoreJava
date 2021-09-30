package Concepts;

class Hello<T> {
	T d;

	public void display() {
		System.out.println(d.getClass().getName());
	}
}

public class Generics {

	public static void main(String[] args) {
		Hello<Integer> h = new Hello<Integer>();
		h.d=10;
		h.display();
	}
}

