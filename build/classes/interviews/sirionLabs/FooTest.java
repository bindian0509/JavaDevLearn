/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews.sirionLabs;



class Fooo {
    
    public static void X() {
        Y();
    }
    public static void Y() {
        System.out.println("Y");
    }
    
}

class bar extends Fooo {
    public static void Y() {
        System.out.println("Z");
    }
}
/**
 *
 * @author bharat
 */
public class FooTest {
    public static void main(String[] args) {
        bar.X();
    }
}
