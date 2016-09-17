/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.HashMap;

public class SumPair {

    public static void printPairs(int[] arr, int sum) {

        int temp;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int index = 0; index < arr.length; index++) {
            hm.put(arr[index], 0);
        }

        for (int index = 0; index < arr.length; index++) {
            temp = sum - arr[index];
            try {
                if (temp >= 0 && hm.get(temp) == 1) {
                    System.out.println("pairs found !");
                    
                    System.exit(0);
                }
            } catch (Exception e) {
                //System.err.println("Exception : " + e);
            }
            hm.put(arr[index], 1);
        }
        System.out.println("Element not found !");
    }
    
     public static int printPairspb(int[] arr, int sum) {

        int temp;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int index = 0; index < arr.length; index++) {
            hm.put(arr[index], 0);
        }

        for (int index = 0; index < arr.length; index++) {
            temp = sum - arr[index];
            try {
                if (temp >= 0 && hm.get(temp) == 1) {
                    return 1;
                                        
                }
            } catch (Exception e) {
                //System.err.println("Exception : " + e);
            }
            hm.put(arr[index], 1);
        }
        return 0;
    }

    
    public static void main(String args[]) {

        int[] arr = {101, 1, 11, 22, 5, 89, 99, 58};

        int sum = 100;

        printPairs(arr, sum);
    }
}
