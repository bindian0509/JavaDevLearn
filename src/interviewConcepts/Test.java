/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewConcepts;

import java.io.Serializable;

/**
 *
 * @author bharat
 */
class Employee implements Serializable{
    
    String name;
    
    static String company = "My Company";
    
    public Employee (String name ) {
        this.name = name; 
    }
    
}
public class Test {
    public static void main (String args[]) throws Exception { 
        Employee e = new Employee("John");
        
       // SerializeObject(e);
    }
}