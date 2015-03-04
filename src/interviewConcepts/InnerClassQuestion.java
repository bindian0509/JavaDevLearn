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
public class InnerClassQuestion {
    public int size = 0 ;    
    
    static class InnerClass  {
        public void incrementParentSize() {
            // InnerClassQuestion.size = InnerClassQuestion.size = 10;
            
            // Can't access size here 
        }
    }
}
