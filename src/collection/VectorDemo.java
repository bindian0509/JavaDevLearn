package collection;
import java.util.*;
/**
 * @author Bharat Verma
 */
public class VectorDemo
{
	public static void printVector (Vector p_vector)
	{
		System.out.println("------------------------------------------");
		System.out.println("Content of Vector : "+p_vector);
		System.out.println("Size of Vector = "+p_vector.size());
		System.out.println("------------------------------------------");
	}
	public static void main(String[] args)
	{
		Vector<Object> vector = new Vector<Object>();
		int primitiveType = 10;
		Integer wrapperType = new Integer(20);
		String str = "Bharat Verma";
		
		vector.add(primitiveType);
		vector.add(wrapperType);
		vector.add(str);
		vector.add(2, new Integer(30));
		vector.capacity(); 
		
		printVector(vector);
		System.out.println(vector.capacity());
		System.out.println("The elements at position 2 is: " 
				+ vector.elementAt(2));
		System.out.println("The first element of vector is: " 
				+ vector.firstElement());
		System.out.println("The last element of vector is: " 
				+ vector.lastElement());
		
		vector.removeElementAt(2);
		
		vector.add(1 , new Integer(10));
		vector.add(3 , new Integer(10));
		System.out.println("The last index of 10 : " 
				+ vector.lastIndexOf(10));
				
		Enumeration e=vector.elements();
		printVector(vector);
		while(e.hasMoreElements())
		{
			System.out.println("The elements are: " + e.nextElement());
		}  
	}
}