package polymorphism;

public class TestOverloaded {

	/**
	 * @param args
	 */
	
	public int jodo (int a, int b ) {
		return a+b;
	}
	
	
	public float jodo (float a , float b) {
		return a+b;
	}
	public double jodo (double a , double b) {
		return a+b;
	}
	
	public String jodo (String a , String b) {
		return a+b;
	}
	
	public void jodo () {
		System.out.println("This one for fun");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestOverloaded tov = new TestOverloaded();
		
		tov.jodo();
		
		System.out.println(tov.jodo(23,22));
		
		System.out.println(tov.jodo(232.23, 22.03));
		
		System.out.println(tov.jodo("Hi, there ... ", "I am Joe Swanson"));

	}

}
