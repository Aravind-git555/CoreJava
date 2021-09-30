package Exception;

public class ExceptionClass {

	/*
	 * public static void main(String[] args) throws IOException { File f = new
	 * File("path"); FileInputStream fi = new FileInputStream(f); fi.getFD(); }
	 */

	public static void main(String[] args) throws ArithmeticException {
throw new ArithmeticException();
	}
}

//User Defined Exception
/*
 * class MyException extends Throwable {
 * 
 * public MyException() { System.out.println("Hello"); }
 */
