/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;
import static java.lang.Math.*;

import static java.lang.System.out;

import static java.lang.Integer.*;
import static java.lang.Long.*;

/**
 *
 * @author Bharats
 */
public class StringTest {

    public static void main(String args[]) {
        out.println("Hello World!");
        out.println("Considering a circle with a diameter of 5 cm, it has:");
        out.println("A circumference of " + (PI * 5) + " cm");
        out.println("And an area of " + (PI * pow(2.5,2)) + " sq. cm");
         out.println(Integer.MAX_VALUE);
        
        String a = "abc";
        String b = "abc";

        Object m = new Object();
        Object n = new Object();

        String x = new String("abc");
        String y = new String("abc");

        System.out.println("if a == b : " + (a == b));
        System.out.println("if x == y : " + (x == y));
        System.out.println("if m == n : " + (m == n));
        System.out.println("if a dot equals b : " + (a.equals(b)));
        System.out.println("if x dot equals y : " + (x.equals(y)));

        System.out.println("if a == x : " + (a == x));

        String name = "Scala"; //1st String object
        String name_1 = "Scala"; //same object referenced by name variable
        String name_2 = new String("Scala"); //different String object
                //this will return true

        if (name == name_1) {
            System.out.println("both name and name_1 is pointing to same string object");
        }

//this will return false
        if (name == name_2) {
            System.out.println("both name and name_2 is pointing to same string object");
        }

    }

}
