package inheritance;

public class Child extends Parent {
    
        static int a=100;
	
	public void method_c1()  {}
	
	public void method_c2()  {}
	
	@Override  
	public String toBeOverRiddenMethod (String str) {
		
		
		return "Hello there from child : "+str;
	}

}
