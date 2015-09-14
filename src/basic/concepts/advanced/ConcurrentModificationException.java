/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bharat
 */
public class ConcurrentModificationException {

    public static void main(String args[]) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(21);

        for (int i = 0; i < intList.size(); i++) {

            intList.add(i);
            for (int j : intList) {
                System.out.println("Value of element i " + j);
            }
            intList.remove(i);
        }

        for (int i : intList) {
            System.out.println("Value of element i outside the list " + i);
        }
        
        /*
        Map<String, Integer> map = new HashMap<String, Integer>();

          // Insert some sample key-value pairs.
          map.put("Key1", 1);
          map.put("Key2", 2);
          map.put("Key3", 3);

          /* Remove a value of the map, while iterating over it.
           * The following code throws a java.util.ConcurrentModificationException. */
         /* for(String key: map.keySet()) {
               if(map.get(key) == 1)
                    map.remove(key);
          }
          System.out.println("Successfully removed a pair!");
          */
          
          List<String> list = new ArrayList<String>();

          // Insert some sample values.
          list.add("Value1");
          list.add("Value2");
          list.add("Value3");

          // Get an iterator.
          Iterator<String> ite = list.iterator();
          while (ite.hasNext()) {
              ite.remove();
          }
          /* Remove the first object of the list. This statement will force the iterator
           * to throw a ConcurrentModificationException. */
          //list.remove(0);
          
          while(ite.hasNext())
               System.out.println(ite.next());

    }

}
