package collection;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
/**
 * @author Bharat Verma
 */
public class HashTableDemo 
{
	public static void printHashTable (Hashtable hashtable)
	{
		System.out.println("Retrieving all keys from the Hashtable");	       
		Enumeration e = hashtable.keys();

		while( e. hasMoreElements() )
		{        
			System.out.println(e.nextElement());
		}
		System.out.println("Retrieving all values from the Hashtable");

		e = hashtable.elements();

		while(e. hasMoreElements())
		{        
			System.out.println(e.nextElement());    
		}
	}
	public static void main(String[] args) 
	{
		// First Constructor
		Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>(); 
		// 2nd with initial Capacity 
		Hashtable ht2 = new Hashtable(5); 
		// 3rd with intial capacity and fill Ratio [0.0 - 1.0]
		//default load factor is 0.75
		Hashtable ht3 = new Hashtable(10, (float) 0.50); 
		// 4th with initialisation from a Map
		Hashtable ht4 = new Hashtable (new HashMap());

		hashtable.put("One", new Integer(1));
		hashtable.put("Two", new Integer(2));
		hashtable.put("Three", new Integer(3));
		hashtable.put("Four", new Integer(4));

		// Get the number of key value pairs
		System.out.println("Hashtable contains " + hashtable.size() + " key value pairs.");
		printHashTable(hashtable);
		// Finding the Element using "Contains"
		if( hashtable.contains(new Integer(1))){
			System.out.println("Hashtable contains 1 as value");
		}else{
			System.out.println("Hashtable does not contain 1 as value");
		}
		// Finding the element using the key and "contains key"
		if(hashtable.containsKey("One")){
			System.out.println("Hashtable contains One as key");
		}else{
			System.out.println("Hashtable does not contain One as value");
		}
		// we need to have set-view to use iterators 
		Set set = hashtable.keySet();
		Iterator itr = set.iterator();
		
		String str;
		while(itr.hasNext()) 
		{
			str = (String) itr.next();
			System.out.println(str + ": " +hashtable.get(str));
		} 
		// String Representation of HashTable
		System.out.println(hashtable.toString());
		
		System.out.println( hashtable.remove("One") + " is removed from the Hashtable.");
	}

}
