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
public class foo {
    
    public static void main(String[] args) throws Exception {
        foo f = new foo();
        f.doSomething(); // Line 1 
        Thread.sleep(20000);
    }
    
    public void doSomething() {
        Object []objArray = new Object[2];
        
        for(int i =0; i<objArray.length; i++)
            objArray[i] = new Object();
    }
}
