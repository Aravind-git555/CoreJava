package Concepts;

public class Var_args {

	public static int add(String...c) { // int[] a
		int b = 0;
		System.out.println("Var args");
		return b;
	}

	public static void main(String[] args) {
		byte a = 1, b = 2;
		add(null);
	}
}

// previuos release will take priority
/*
 * long int short byte
 * 
 * Can't place var args in first place while using two params Can't place two
 * var args in params if u declare another single dimensional array then u will
 * get duplicates error as it internally works as array Ambigous error failure
 * case: calling like add(null);
 * 
 * 
 */