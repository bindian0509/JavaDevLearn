/*
 ange this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author BHARAT VERMA <>
 */
public class Day25RunningTimeAndComplexity {

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num == 3) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }
        if (num % 3 == 0) {
            return false;
        }

        int i = 5;
        int w = 2;

        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i += w;
            w = 6 - w;
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[] arr = new int[T];
        int i = 0;
        while (T-- > 0) {
            int n = sc.nextInt();
            arr[i] = n;
            i++;
        }

        for (int num : arr) {
            if (isPrime(num)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }

    }
}
