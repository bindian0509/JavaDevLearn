/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviews;

/**
 * circular prime number
 *
 * 197 971 719
 *
 * @author bharat
 */
import java.util.*;

public class GreyOrange {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int leftCircularRotation(int num) {
        int unitDigit = num % 10;
        num = num / 10;
        int temp = 1;
        while (num / temp != 0) {
            temp *= 10;
        }
                System.err.println("PRINTING FROM METHOD: leftCircularRotation ");

        System.out.println(num + unitDigit * temp);
                        System.err.println("PRINTING ENDS FROM METHOD: leftCircularRotation ");

        return num + unitDigit * temp;
    }

    public static boolean isCircularPrime(int number) {
        int temp = number;
        System.err.println("PRINTING FROM METHOD: isCircularPrime ");
        System.out.println(temp);
        System.out.println(number);
        while (isPrime(temp) && ((temp = leftCircularRotation(temp)) != number));
        System.out.println(temp);
        System.out.println(number);
        System.err.println("PRINTING ENDS FROM METHOD: isCircularPrime ");
        if (number == temp && isPrime(number)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        int N = 719 ;
        
        System.out.println("Is Circular Prime : "+isCircularPrime(N));
        
        
        /*
        Scanner scan = new Scanner(System.in);

        int howManyCircularPrimes = 0;

        int userInt = scan.nextInt();
        for (int i = 2; i <= userInt; i++) {
            if (isPrime(i)) {
                if (isCircularPrime(i)) {
                    howManyCircularPrimes++;
                }
            }
        }
        System.out.println(howManyCircularPrimes);*/

    }
}
