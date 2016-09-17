/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews.sirionLabs;

/**
 *
 * @author bharat
 */
public class Hi {
    
    static class A { 
        static void hi () {
            System.err.print("A");
        }
    }
    class B {
        void hi () {
            System.err.print("B");
        }
    }
    void hi () {
        class C {
            void hi () { 
                System.err.print("C");
            }
        }
        Object o = new C() { void hi () {System.err.print("D");} };
        
        ((C)o).hi(); new C().hi(); new B().hi(); 
    }
    static public void main (String args[]) {
        new Hi().hi();
        A.hi();
    }
}
//DCBA