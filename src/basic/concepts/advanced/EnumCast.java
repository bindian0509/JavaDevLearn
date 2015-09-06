/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

/**
 *
 * @author Bharat
 */
public class EnumCast {
    
    
    public enum seasons {SUMMER, WINTER, MONSOON, AUNTUM, SPRING}
    
    public static void main (String args[]) {
        for(seasons s : seasons.values()) 
            System.out.println("- "+s);
    }
}
