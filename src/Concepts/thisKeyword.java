package Concepts;

class parent {

	parent() {
		this(10);
		System.out.println("Default");

	}

	parent(int i) {
		System.out.println("Integer");
	}
}

public class thisKeyword {

	public static void main(String[] args) {
		parent h = new parent();

	}
}
