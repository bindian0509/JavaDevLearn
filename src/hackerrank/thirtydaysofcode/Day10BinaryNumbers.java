/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 *
 * @author bharat
 */
public class Day10BinaryNumbers {
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        StringBuilder bin = new StringBuilder();
        while (n>0) {
            bin.append(n%2);
            n=n/2;
        }    
        bin.reverse();
        
        char [] ch = bin.toString().toCharArray();
        int result=0;
        
        
        for (int i = 0; i < ch.length; i++) {
            //System.out.println(ch[i]);
            
            if(ch[i] == '1' && ch[i+1] == '1'){
                result++;
            }
            
        }
        
        System.out.println(result);
    }
}
