/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author bharat
 */
public class Day4ClassVsInstance {

    private int age;

    public Day4ClassVsInstance(int initialAge) {
        // Add some more code to run some checks on initialAge
        if(initialAge < 0 ){
            System.out.println("Age is not valid, setting age to 0");
            this.age = 0;
        } else 
            this.age = initialAge;                    
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        
        if(this.age < 13)
            System.out.println("You are young.");
        else if (this.age>=13 && this.age<18)
            System.out.println("You are a teenager.");
        else 
            System.out.println("You are old.");
    }

    public void yearPasses() {
        // Increment this person's age.        
        this.age++;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int _testCases = scan.nextInt();
        
        for(int i=0; i<_testCases; i++) {
            
            Day4ClassVsInstance _obj = new Day4ClassVsInstance(scan.nextInt());
            
            for(int j=0;i<3;j++)
                _obj.yearPasses();
            
            _obj.amIOld();
            
        }
        
        

    }
}
