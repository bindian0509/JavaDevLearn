/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Bharat
 */
public class Panagram {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        
        HashMap<Character, Integer> map = new HashMap<>();
        /*for (int i = 65; i <= 90; i++) {
         map.put((char) i, 0);
         }*/
        for (int i = 97; i <= 122; i++) {
            map.put((char) i, 0);
        }

        str = str.toLowerCase(Locale.US);
        char[] strArr = str.toCharArray();

        for (char i : strArr) {
            //System.out.println("Char : "+i);
            if (i != ' ' || i != '.') {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println("not pangram");
                System.exit(0);
            }
        }
        System.out.println("pangram");

    }

}
