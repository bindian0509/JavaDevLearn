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
public class TestArgs {
    
    
    public static void main(String args[]) {
        
        byte b=3;
        converter(3,3,3);
    }
    
    public static void converter(byte b1, byte b2, byte b3) {
        System.out.println("3 byte argument method is called !");
    }
    public static void converter(byte...b3) {
        System.out.println("varargs byte argument method is called !");
    }
    public static void converter(int...b1) {
        System.out.println("varargs int argument method is called !");
    }
    public static void converter(int i1, int i2, int i3) {
        System.out.println("3 int argument method is called !");
    }
}
