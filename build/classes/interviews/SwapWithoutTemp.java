/**
 * 
 */
package interviews;

/**
 * @author BHARAT VERMA
 * @category INTERVIEW
 *
 */
public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		/*
		 
		 A       B       A^B (A XOR B)
		 0       0       0 (zero because operands are same)
		 0       1       1
		 1       0       1 (one because operands are different)
		 1       1       0
		 
        */
		
		 int a = 123456; //0010 in binary
		 int b = 654321; //0100 in binary
		       
		 System.out.println("value of a and b before swapping, a: " + a +" b: " + b);
		        
		 //swapping value of two numbers without using temp variable and XOR bitwise operator     
		 a = a^b; //now a is 6 and b is 4
		 b = a^b; //now a is 6 but b is 2 (original value of a)
		 a = a^b; //now a is 4 and b is 2, numbers are swapped
		       
		 System.out.println("value of a and b after swapping using XOR bitwise operation, a: " + a +" b: " + b);


	}

}
