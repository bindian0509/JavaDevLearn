package maths;

public class MathsTest {
	
	public static void main (String args[]) {
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        try {
        	double a = 30/0.0;
        } catch (Exception e) {
        	 System.out.println(e.getMessage());
        }
	}

}
