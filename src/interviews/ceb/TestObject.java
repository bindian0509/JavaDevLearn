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
public class TestObject {
    
    
    public static void main(String args[]) {
        Super s = new Sub();
        Super s1 = s.add();
        
        System.out.print(s1==s);
    }
}

class Super {
 
    public Super add() {
        System.out.print("Super ");
        return this;
    }
    
}

class Sub extends Super {
    
    @Override
    public Sub add() {
        System.out.print("Sub ");
        return this;
    }

}
