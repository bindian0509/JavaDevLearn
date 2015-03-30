/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Belzabar;

import static java.lang.Math.*;

/**
 *
 * @author bharat
 */
public class GenMillionPrimeNums {

    
    public static void main(String args[]) {

        int i, j;
        double lt = sqrt(LIMIT);
        System.out.println("2");
        for (i = 3; i <= lt; i += 2) {
            for (j = i * i; j <= LIMIT; j += i) {
                prime[j] = 1;
            }
        }

        for (i = 3; i <= LIMIT; i += 2) {
            if (!prime[i]) {
                System.out.println(i);
            }
        }
        return 0;
    }

}
