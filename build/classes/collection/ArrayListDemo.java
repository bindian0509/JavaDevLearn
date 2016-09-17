package collection;

import java.util.*;
/**
 * @author Bharat Verma
 */
public class ArrayListDemo 
{
	public static void printArrayList (ArrayList p_arraylist)
	{
		System.out.println("------------------------------------------");
		System.out.println("Content of ArrayList : "+p_arraylist);
		System.out.println("Size of ArrayList = "+p_arraylist.size());
		System.out.println("------------------------------------------");
	}
	public static void main(String[] args) 
	{
		ArrayList<Object> sampleArrayList =new ArrayList<Object>(); // you can specify the object type
		
		Integer intr = new Integer(729);
		String str ="Bharat";
		double dtr = 169.721;
		
		printArrayList(sampleArrayList);
		
		sampleArrayList.add(intr);
		sampleArrayList.add(str);
		sampleArrayList.add(dtr);
		printArrayList(sampleArrayList);
	
		Integer i5=new Integer(50);
		sampleArrayList.add(3, i5); // using add(int index, object obj)
		printArrayList(sampleArrayList);
		
		sampleArrayList.remove(3); // using remove()
		printArrayList(sampleArrayList);
		
		Object a=sampleArrayList.clone(); // using clone
		
		System.out.println("The clone is: " + a);
		
		printArrayList(sampleArrayList);
		
		System.out.println(sampleArrayList.contains("Bharat")); // True as it contains
		
		// iteration using iterator
		Iterator iter = sampleArrayList.iterator();
		System.out.println("Using Iterator");
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		// using for loop and indexes 
		System.out.println("Using for loop and index");
		for (int i=0; i<sampleArrayList.size(); i++)
		{
			System.out.println(sampleArrayList.get(i));
		}
	}
}