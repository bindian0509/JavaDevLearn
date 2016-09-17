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
public class SomeMoreFoo {
    
    
    static int foo (int n) {
        int result = 0;
        
        n<<=1;
        System.err.println("After Shift Value of n : "+n);
        
        while (n>0) {
            result += (n/=2)%2;
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Value of foo(32775) is : "+foo(32775));
    }
}
