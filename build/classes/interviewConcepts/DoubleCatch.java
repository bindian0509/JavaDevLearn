/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewConcepts;

/**
 *
 * @author bharat
 */
public class DoubleCatch {

    
    
    public static void main (String args[]) {
        
        
        /*
        try 
        { 
            System.exit(0); 
        } 
        finally 
        {
            System.out.println( "Finally" ); 
        } 
        */
        try {
            int a = 30/0;
            System.out.println(a);
        }
        catch (ArithmeticException ea) {
            System.out.println("Exception Message : "+ea.getMessage());
        }
        catch (Exception e) {
            System.out.println("Exception Message : "+e.getMessage());
        }
        finally {
            System.out.println("Woof Woof ");   
        } 
    }
}
