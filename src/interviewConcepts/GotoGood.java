/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewConcepts;

/**
 *
 * @author bharat
 */
public class GotoGood extends Thread {
    
    private int x = 2;
    
    public static void main (String args[]) throws Exception {
        new GotoGood().makeItSo();
    }
    
    
    public GotoGood () {
        System.out.println("TEST");        
        x =5;
        start();
    }
    
    public void makeItSo() throws Exception {
        join();
        
        x = x-1;
        System.out.println(x);
    }
    
    public void run() {
        System.out.println("RUN");
        x *= 2;
    }
}
