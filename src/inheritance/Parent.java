package inheritance;

public class Parent {
	
	static int a= 10; 
	
	Parent () {
		System.out.println("Class parent is called .... what are you waiting for !");
	}
	
	public int method_p1 (int a, int b) {
		return a+b;		
	}
	
	protected int method_p2 (int a , int b) {
		return a-b;
	}
	
	
	protected String toBeOverRiddenMethod (String str) {
		
		
		return "Hello there from parent "+str;
	}
}
