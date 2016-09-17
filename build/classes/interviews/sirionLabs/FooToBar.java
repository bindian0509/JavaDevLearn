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



public class FooToBar {

    
    
    static int foo (int n) {
        if(n<=0)
            return 1;
        else
            return (foo(n-1) + bar(n));
    }
    
    static int bar(int n) {
        if(n<=0)
            return 1;
        else
            return (foo(n-1)+foo(n-2)+bar(n-1));           
    }
    
    public static void main(String[] args) {
        System.out.println("Value of foo(10) is : "+foo(10));
    }
}
