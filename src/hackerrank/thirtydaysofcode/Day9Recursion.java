/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author bharat
 */
public class Day9Recursion {
    
    
    public static int factorial (int n) {
        
        if(n==0 || n==1)
            return n;
        else
            return n*factorial(n-1);
                
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(factorial(n));
    }
    
}
