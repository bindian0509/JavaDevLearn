/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.ArrayList;

/**
 *
 * @author Bharat
 */
public class bns {
    public static void main(String args[]) {
        
        
        ArrayList<String> al = new ArrayList();
        
        for(String a : al) {
            
            System.out.println(a);
            al.add("ds");
            al.remove(0);
            
        }
        
    }
    
}
