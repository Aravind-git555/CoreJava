package Concepts;

/*From java 8 only
A functional interface is called when it has only one method. Then only lamda will work. 
otherwise it won't.
*/
@FunctionalInterface
interface show {
	void hello();
}

public class LamdaExpression {

	public static void main(String[] args) {
		show s = () -> System.out.println("Hello");
		s.hello();
	}
}