/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.Stack;

/**
 *
 * @author Bharat
 */
public class ReverseSentenceWords {
    
    public static void main(String args[]) {
        
        
        String str = "MMT is a great company";

        System.out.println("Original String : "+str);
        String[] strSplit = str.split(" ");
        
        Stack<String> stk = new Stack<String>();
        
        
        for(String chunks : strSplit) 
            stk.push(chunks);
        
        System.out.print("Reversed String : ");
        
        while(!stk.isEmpty()) {
            System.out.print(stk.pop());
            System.out.print(" ");
        }
    }
}
