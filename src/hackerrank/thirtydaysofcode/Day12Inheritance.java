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
class Person {

    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                + "\nID: " + idNumber);
    }

}

class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public char calculate() {

        int sum = 0;
        for (int score : this.testScores) {
            sum += score;
        }

        int avg = (int) sum / this.testScores.length;

        if (avg <= 100 && avg >= 90 ) {
            return 'O';
        }
        if (avg >= 80 && avg < 90) {
            return 'E';
        }
        if (avg >= 70 && avg < 80) {
            return 'A';
        }
        if (avg >= 55 && avg < 70) {
            return 'P';
        }
        if (avg >= 40 && avg < 55) {
            return 'D';
        }
        if (avg<40) {
            return 'T';
        }
        return ' ';        
    }   

}

public class Day12Inheritance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
