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
public class Day1DataTypes {
    
    
    
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int userInt =scan.nextInt();  
        
        double userDouble = scan.nextDouble();
        scan.nextLine();
        String userString = scan.nextLine();
        
        
        System.out.println(i+userInt);
        System.out.println(d+userDouble);
        System.out.println(s+userString);
        
        
        scan.close();
        
    }   
    
    
}
