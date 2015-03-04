/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewConcepts;
import java.lang.reflect.*;
/**
 *
 * @author bharat
 */
public class ReflectionsDemo {

    public static void main(String args[]) {
    int co = 0;
        try {

            Class c = Class.forName("java.sql.Connection");
			
            Method m[] = c.getDeclaredMethods();
            
            
            for (int i = 0; i < 76; i++) {

                System.out.println(m[i].toString());
                    co++;
            }

        } catch (Throwable e) {

            System.err.println(e);

        }
        
        System.out.println("Total Methods : "+co);              
                

    }
}
