package Concepts;

interface Interface{
	void hello();
	}


public class AnonymousClass {

	
	public static void main(String[] args) {
		Interface i=new Interface() {
			
			public void hello() {
				System.out.println("Hello");
			}		
		};
		
		i.hello();
		
	}
}
