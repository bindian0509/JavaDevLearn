package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UseOfCollections extends SampleObject
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		/* Demonstration of Vector */
		Vector vector = new Vector();

		String abc = "1"+2+4;
		Integer a =new Integer(2+3+"1"+2+4);
		
		System.out.println(a);
		
		int primitiveType = 10;
		Integer wrapperType = new Integer(20);
		String str = "BHARAT VERMA";

		//adding to the vector 
		vector.add(primitiveType);
		vector.add(wrapperType);
		vector.add(str);
		vector.add(2, new Integer(30));

		System.out.println("The elements of vector: " + vector);
		System.out.println("The size of vector are: " + vector.size());

		System.out.println("The elements at position 2 is: " 
				+ vector.elementAt(2));

		System.out.println("The first element of vector is: " 
				+ vector.firstElement());

		System.out.println("The last element of vector is: " 
				+ vector.lastElement());
		// simple iteration funda
		for ( int i=0 ; i < vector.size() ; i ++ ) 
			System.out.println(" Vector Contains : "+vector.get(i));

		vector.removeElementAt(2);

		Enumeration e=vector.elements();

		// Using Enumeration 
		System.out.println("The elements of vector: " + vector);
		while(e.hasMoreElements()){
			System.out.println("The elements are: " + e.nextElement());
		}

		/* Demonstration of Hashset */

		//create object of HashSet
		HashSet hSet = new HashSet();

		//add elements to HashSet object
		hSet.add(new Integer("1"));
		hSet.add(new Integer("2"));
		hSet.add(new Integer("3"));

		System.out.println("HashSet before removal : " + hSet);

		/*
		  To remove all elements from Java HashSet or to clear HashSet object use,
		  void clear() method.
		  This method removes all elements from HashSet.
		 */

		hSet.clear();
		System.out.println("HashSet after removal : " + hSet);

		/*
		  To check whether HashSet contains any elements or not use
		  boolean isEmpty() method.
		  This method returns true if the HashSet does not contains any elements
		  otherwise false.
		 */

		System.out.println("Is HashSet empty ? " + hSet.isEmpty()); 

		// ArrayList 
		
		ArrayList<SampleObject> So = new ArrayList<SampleObject>();
		
		SampleObject so_1 = new SampleObject("Bharat Verma", 23, 89.03);
		So.add(so_1);
		SampleObject so_2 = new SampleObject("Shweta Verma", 22, 99.55);
		So.add(so_2);
		
		Iterator<SampleObject> iter = So.iterator();
		while (iter.hasNext())
		{
			System.out.println("+-+-+-+-+-+-+-+-+");
			printSampleObject(iter.next());
			System.out.println("+-+-+-+-+-+-+-+-+");
		}
		
		List sortedList = new LinkedList();
		sortedList.addAll(Arrays.asList(new String[]{"ant", "bat", "cat", "dog"}));
		System.out.println(" I am about to show you sorted Linked List before cow : "+sortedList);

		// Search for the non-existent item
		int index = Collections.binarySearch(sortedList, "cow");      // -4

		// Add the non-existent item to the list
		if (index < 0) {
		    sortedList.add(-index-1, "cow");
		}
		
		System.out.println(" I am about to show you sorted Linked List after the cow comes : "+sortedList);
	}

}
