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
class A {
    public int i = 10 ;
   
   public void printValue () { 
       System.out.println("Value-A and valud of i "+this.i);
   }
}
class B extends A {
   public int i = 11 ;
   
   public void printValue () { 
       System.out.println("Value-B and valud of i "+super.i);
   }
   
}

public class OverRiddance {
    public static void main (String argv[]) {
        A a = new B();        
        a.printValue();
        System.out.println(a.i);
        
        
        
        A a2 = new A();
        a2.printValue();
    }
}
