/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews.sirionLabs;


final class SomeClass {
    public SomeClass (int i) {
        id = i; 
    }
        
    public boolean sameVal (Object other) {
        return other instanceof SomeClass && equals(other);
    }
    
    public boolean equals (SomeClass other) {
        return other != null && id == other.id;
    }
    
    private int id;
}
/**
 *
 * @author bharat
 */
public class BadEqualsDemo {
    public static void main (String args[]) {
        SomeClass obj1 = new SomeClass(4);
        
        SomeClass obj2 = new SomeClass(4);
        
        
        System.out.println("obj1.equals(obj2) : "+obj1.equals(obj2));
        System.out.println("obj1.sameVal(obj2) : "+obj1.sameVal(obj2));
    }
}
