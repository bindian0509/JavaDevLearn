/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews.ceb;

/**
 *
 * @author Bharat
 */

// Find at which line the error will occur 
final class Tester extends developer{
    
    public static void main(String args[]) {
        developer dev = null; // D1
        
        Tester test = null; // D2
        
        Runnable r = (Runnable) dev; // L1
      //at this line -> commented it out to hide the problem  r = (Runnable) test; // L2 
    }
    
}

class developer {
    
}