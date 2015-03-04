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
public class ExceptionPlayer {
    
    public static void aMethod() throws Exception 
    {
        try /* Line 5 */
        {
            throw new Exception(); /* Line 7 */
        } 
        finally /* Line 9 */
        {
            System.out.print("finally "); /* Line 11 */
        } 
    } 
    public static void main(String args[]) 
    {
        try 
        {
            aMethod();  
        } 
        catch (Exception e) /* Line 20 */
        {
            System.out.print("exception "); 
        } 
        System.out.print("finished"); /* Line 24 */
        
        
        
        
        
         try 
        {
            badMethod();  
            System.out.print("A"); 
        }  
        catch (Exception ex) 
        {
            System.out.print("B"); 
        }  
        finally 
        {
            System.out.print("C"); 
        }  
        System.out.print("D"); 
    } 
    public static void badMethod() {}
}
