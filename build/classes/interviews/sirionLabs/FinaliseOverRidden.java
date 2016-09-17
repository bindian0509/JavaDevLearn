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
public class FinaliseOverRidden {

    
    protected void finalize () {
        int x = 0;
        
        int y = 4/x;
    }
    public static void main(String[] args) {
        FinaliseOverRidden obj = new FinaliseOverRidden();
        obj.finalize();
    }
}
