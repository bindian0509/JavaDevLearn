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
public class Day3Conditional {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else if(n%2==0 && (n>=2 && n<=5)) {
         // Complete the code 
         ans = "Not Weird";
      } else if (n%2==0 && (n>=6 && n<=20)) {
           ans = "Weird";
      } else if (n%2==0 && (n>20)) {
          ans = "Not Weird";
      }
      System.out.println(ans);
   }
}
