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
public class Day2Operators {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);        
        double mealCost = scan.nextDouble();        
        int tipPercent = scan.nextInt();        
        int taxPercent  = scan.nextInt();
        int totalCost = (int) Math.round(mealCost + (mealCost * ((double)tipPercent/100)) + (mealCost * ((double)taxPercent/100)));         
        System.out.println("The total meal cost is "+totalCost+" dollars.");
        
    }
    
}
