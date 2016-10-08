/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author BHARAT VERMA <bharat.verma@shopclues.com>
 */


interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculatori implements AdvancedArithmetic {
    
    public int divisorSum(int n) {
        
        int i = n;
        int sum=0;
        
        while (i>0) {
            if(n%i == 0) {
                sum += i;
            }
            i--;
        }
        
        
        return sum;
    }
    
}


public class Day19Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculatori(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
