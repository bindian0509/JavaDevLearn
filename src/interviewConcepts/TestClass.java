/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewConcepts;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bharat
 */
class MyClass {

    public static List<String> cars = new ArrayList<String>();

    static {
        cars.add("Ferrari");
        cars.add("Scoda");
    }
    public static int myVariable = 0; // It is a variable which belongs to the class and not to object(instance) 
    
    public static final double PI = 3.141592653589793;
    
    final int k;
    
    MyClass(int a) {
        k = a;
    }

}

public class TestClass  {

    public static void main(String args[]) {
        System.out.println(MyClass.cars.get(0));  //This will print Ferrari
        
        MyClass _obj1 = new MyClass(2);
        //System.out.println(MyClass.k);
        MyClass _obj2 = new MyClass(3);
        System.out.println(_obj2.myVariable);
        
        //Syntax : Class.variable
        _obj1.myVariable = 69; // How ever it should be replaced with class refrence
        
        System.out.println(_obj2.myVariable); // This will print 69
        
        
    }
}