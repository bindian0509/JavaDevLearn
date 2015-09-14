/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.util.Scanner;

/**
 *
 * @author Bharat
 */
public class SweetCandies {

    public static int maxContSum(String[] arr, int n) {

        int max = 0;
        int currSum = 0;

        for (int i = 0; i < n; ++i) {
            currSum += Integer.parseInt(arr[i]);
            if (max < currSum) {
                max = currSum;
            } else if (currSum < 0) {
                currSum = 0;
            }
        }
        return max;
    }


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        String num_of_candies = in.nextLine();

        String sweetness = in.nextLine();

        int num = Integer.parseInt(num_of_candies);
        String[] csarr = sweetness.split(" ");
        
        System.out.println(maxContSum(csarr, num));
    }
}
