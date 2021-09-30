package Java8;

interface Say {
	String message(String messege);
}

public class LambdaExpression {

	public static void main(String[] args) {
		Say s = string -> string + " thanks";
		
		System.out.println(s.message("Mama"));
	}
}
