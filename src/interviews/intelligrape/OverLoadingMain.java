/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews.intelligrape;

/**
 *
 * @author bharat
 */
public class OverLoadingMain {

    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(int a) {
        System.out.println(a);
    }

    public static void main(String args[]) {
        System.out.println("main() method invoked");
        main(10);

        OverLoadingMain obj = new OverLoadingMain();
        obj.sum(20, 20);//now second int literal will be promoted to long  
        obj.sum(20, 20, 20);
    }
}
