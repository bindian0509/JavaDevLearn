/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.challenges;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bharat
 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        String[] r = s.split("(?=\\p{Upper})");
        
        System.out.println(r.length);
        
        System.out.println(Arrays.deepToString(r));
        
    }    
}
