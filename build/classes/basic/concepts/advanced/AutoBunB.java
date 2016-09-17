/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.HashMap;
import java.util.Vector;

/**
 *
 * @author Bharat
 */
public class AutoBunB {

    static int isSumPossible(Vector<Integer> a, int N) {

        HashMap<Integer, Integer> hmp = new HashMap<Integer, Integer>();

//        for (Integer i : a) {
//            System.out.println("value "+i);
//        }
        
        
        for(int index=0; index<a.size();index++) {
            //System.out.println(a.get(index));
            hmp.put(a.get(index), 1);
            
        }
        
        
        
        for(int index=0; index<a.size();index++) {
            //System.out.println(a.get(index));
            //hmp.put(a.get(index), 1);
            if( hmp.get(N-a.get(index)) != null) {
                return 1;
            }
        }
        /*
        
         for ($i = 0; $i < count($arr); ++$i) {
         $hashMap[$arr[$i]] = 1;
         }

         for ($i = 0; $i < count($arr); ++$i) {
         if ($hashMap[$n - $arr[$i]]) {
         return 1;
         }
         }*/
        return 0;
    }

    public static void main(String args[]) {

        Vector<Integer> arr = new Vector<Integer>();

        arr.add(22);
        arr.add(22);
        arr.add(28);
        arr.add(22);
        arr.add(38);
        arr.add(22);

        int res = isSumPossible(arr, 66);

        //System.err.println("Pump up kids" + res);
    }
}
