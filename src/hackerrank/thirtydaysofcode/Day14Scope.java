/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

/**
 *
 * @author BHARAT VERMA <>
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {

    private int[] elements;
    public int maximumDifference;

    public Difference(int [] a) {        
        this.elements = a; 
    }
    
    public void computeDifference() {
        int mn=this.elements[1], mx=0;
        
        for (int i : this.elements) {
            mx = max(mx,i);
            mn = min(mn,i);
        }
        this.maximumDifference = mx-mn;
        
    }
    public static int max (int a, int b) {
        return a>b?a:b;
    }
    
    public static int min (int a, int b) {
        return a>b?b:a;
    }
    
}

public class Day14Scope {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        sc.close();

        int [] a = {1,9,2,8,3,7,4,6,5};

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
