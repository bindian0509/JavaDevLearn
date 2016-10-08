/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author bharat
 */
public class Day11Array2D {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        /*
        String str = "abcdeabfghabc";

        char[] ch = str.toCharArray();

        int[][] tempArr = new int[ch.length + 1][ch.length + 1];

        for (int i = 0; i <= ch.length; i++) {
            for (int j = 0; j <= ch.length; j++) {
                tempArr[i][j] = 0;
            }
        }
        for (int i = 1; i <=ch.length; i++) {
            for (int j = 1; j <= ch.length; j++) {
                if (ch[i - 1] == ch[j - 1] && i != j) {
                    tempArr[i][j] = 1 + tempArr[i - 1][j - 1];
                } else {
                    tempArr[i][j] = max(tempArr[i - 1][j], tempArr[i][j - 1]);
                }
            }

        }
        System.out.println(tempArr[ch.length][ch.length]);
        System.err.println(Arrays.deepToString(tempArr));
         */

        Scanner in = new Scanner(System.in);
        int ar[][] = {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};

        // done to handle the case of all neagtive integers 
        int maxSum = -36985247;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j + 2 < 6 && i + 2 < 6) {
                    int sum = 
                            ar[i][j] + 
                            ar[i][j + 1] + 
                            ar[i][j + 2] + 
                            ar[i + 1][j + 1] + 
                            ar[i + 2][j] + 
                            ar[i + 2][j + 1] + 
                            ar[i + 2][j + 2];
                    
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }

            }
        }
        
        System.out.println(maxSum);
    }

}
