/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.Scanner;

/**
 *
 * @author Bharat
 */
public class StairCase {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        
        int size = in.nextInt();
        int tempSize = size-1;
        for(int i=0;i<size;i++) {
            for(int j=0; j<size;j++) {
                
                if(j >= tempSize)
                    System.out.print("#");
                else
                    System.out.print(" ");
                
                
            }
            System.out.println();
            tempSize--;
        }
    }
    
}
