/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.lang.reflect.Array;
import java.util.List;


/**
 *
 * @author BHARAT VERMA <bharat.verma@shopclues.com>
 */
public class Day21Generics {

    public static  < T > void printArray( T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String args[]) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};

        printArray(intArray);
        printArray(stringArray);

        if (Day21Generics.class.getDeclaredMethods().length > 2) {
            System.out.println("You should only have 1 method named printArray.");
        }
    }

}
