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
import javax.swing.*;
 
public class FooGUI {
 
    public static void main(String[] args) {
        //initialize GUI components
        final JFrame jf = new JFrame("Hello world!"); //allows jf to be accessed from inner class body
        jf.add(new JButton("Click me ..............................."));
 
        // pack and make visible on the Event-Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                jf.pack(); //this would be a compile-time error if jf were not final
                jf.setLocationRelativeTo(null);
                jf.setVisible(true);
            }
        });
    }
}