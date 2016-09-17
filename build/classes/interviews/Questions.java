package interviews;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Questions 
{
	public static void main(String[] args) 
	{
		Map<Object, Object> map = new LinkedHashMap<Object, Object>();
		Map<Object, Object> hm = new HashMap<Object, Object>();
		
		// Add some elements to linked hash map
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		map.put("2", "value4");
		
		//Add some elements to Hashmap
		hm.put("21", "Twenty One");
		hm.put("22", "Twenty Two");
		hm.put("23", "Twenty Three");
		hm.put("24", "Twenty Four");
		hm.put("25", "Twenty Five");
		hm.put("26", "Twenty Six");
		hm.put("27", "Twenty Seven");
		
		// List the entries
		System.out.println("Entries from Linked Hashmap - \n");
		for (Iterator<Object> it=map.keySet().iterator(); it.hasNext(); ) {
		    Object key = it.next();
		    //System.out.println(key);
		    Object value = map.get(key);
		    System.out.printf(key+" -"+"> "+value+"\n");
		    
		}
		
		System.out.println("Entries from Hashmap - \n");
		//List the entries from Hashmap hm
		for (Iterator<Object> it=hm.keySet().iterator(); it.hasNext(); ) {
		    Object key = it.next();
		    //System.out.println(key);
		    Object value = hm.get(key);
		    System.out.printf(key+" -"+"> "+value+"\n");
		    
		}
		
		hm.put("28", "Twenty Eight");
		hm.put("29", "Twenty Nine");
		
		System.out.println("Entries from Hashmap After 28 and 29 - \n");
		//List the entries from Hashmap hm
		for (Iterator<Object> it=hm.keySet().iterator(); it.hasNext(); ) {
		    Object key = it.next();
		    //System.out.println(key);
		    Object value = hm.get(key);
		    System.out.printf(key+" -"+"> "+value+"\n");
		    
		}
		
		// [1=value1, 2=value4, 3=value3]
	
	}

}
