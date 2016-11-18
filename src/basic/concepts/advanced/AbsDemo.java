/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

/**
 *
 * @author BHARAT VERMA <bharat.verma@shopclues.com>
 */

abstract class myAbsClass {
    
    public static void doSomething () {
        System.out.println("BNGYGH");
    }
    
}

public class AbsDemo extends myAbsClass{

    public static void main(String[] args) {
        doSomething();
    }
}
