/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

/**
 *
 * @author BHARAT VERMA <>
 */
public class Day18StacksAndQueue {
    
    protected Stack<Character> stk = new Stack<Character>();
    protected Queue<Character> que = new LinkedList<Character>();
    
    public void pushCharacter(Character c) {
        this.stk.push(c);
    }
    
    public void enqueueCharacter (Character c) {
        this.que.add(c);
    }
    
    public char popCharacter() {
        return this.stk.pop();
    }
    
    public char dequeueCharacter() {
        return this.que.poll();
    }
    

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18StacksAndQueue p = new Day18StacksAndQueue();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

    
}
