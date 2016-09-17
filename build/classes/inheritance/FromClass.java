package inheritance;

public class FromClass 
{
	public static int upperNumber = 123;
	
	public FromClass()
	{
		super();
	}
	
	public void init ()
	{
		System.out.print("I am in FromClass");
	}
	public static void staticMethod()
	{

		System.out.println("FromClass : inside staticMethod");

	}
	
	public static double mean(int[] p) {
		int sum = 0;  // sum of all the elements
		for (int i=0; i<p.length; i++) {
			sum += p[i];
		}
		return ((double)sum) / p.length;
	}//endmethod mean


}
