/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

/**
 *
 * @author Bharat
 */
import javax.swing.JOptionPane;

public class Loops {
	public static void main(String[] args) {
	String input = JOptionPane.showInputDialog( "Enter a single integer:" );//asks user to input the variable
	int userInt = Integer.parseInt( input );//parses user's input into integer form
	
	for (int coprime = 2; coprime <= 100; coprime = coprime+1){
		for (int divisor = 2; divisor <= userInt/2; divisor = divisor+1){
			if ((userInt % divisor == 0)&&(coprime % divisor == 0)) continue; 
			else System.out.println(coprime);
						
		}
		
	}
	
	}

}

