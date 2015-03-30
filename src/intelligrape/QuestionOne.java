/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intelligrape;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author bharat
 */
public class QuestionOne {

    static int minimumDenominations(int totalAmount) {

        int result = 0;

        int denom[] = {20, 10, 5, 2, 1};

        for (int i = 0; i < denom.length; i++) {
            result += totalAmount / denom[i];
            totalAmount = totalAmount % denom[i];

        }

        return result;
    }

    static boolean validate(String identifier) {

        char[] id = identifier.toCharArray();
        if (identifier.startsWith("$") || identifier.startsWith("_") || (id[0] >= 'A' && id[0] <= 'Z') || (id[0] >= 'a' && id[0] <= 'z')) {

            for (int i = 1; i < id.length; i++) {
                if (!(id[i] == '$' || id[i] == '_' || (id[i] >= 'A' && id[i] <= 'Z') || (id[i] >= 'a' && id[i] <= 'z') || (id[i] >= '0' && id[i] <= '9'))) {
                    return false;
                }
            }
            return true;
        }

        return false;

    }

    /*
     * Complete the function below.
     */
    static int[] searchMinSumPair(int[] array) {

        int min1, min2;

        if (array[0] <= array[1]) {

            min1 = array[0];
            min2 = array[1];
        } else {

            min1 = array[1];
            min2 = array[0];
        }

        for (int i = 2; i < array.length; i++) {

            if (array[i] < min1) {

                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2) {

                min2 = array[i];
            }

        }

        return new int[]{min1, min2};

    }

    static int convert(int n) {

        int b = 5;
        int q = n, r;
        String ans = "";
        while (q != 0) {
            r = q % b;
            ans = r + ans;
            q = q / b;
        }

        return Integer.parseInt(ans);

    }

    static int[] sortArray(int[] arr) {

        int res[] = new int[arr.length];
        Map mapping = new HashMap<Integer, Integer>();
        mapping.put(0, 9);
        mapping.put(1, 4);
        mapping.put(2, 8);
        mapping.put(3, 7);
        mapping.put(4, 2);
        mapping.put(5, 1);
        mapping.put(6, 6);
        mapping.put(7, 5);
        mapping.put(8, 0);
        mapping.put(9, 3);

        Map rmapping = new HashMap<Integer, Integer>();
        rmapping.put(9, 0);
        rmapping.put(4, 1);
        rmapping.put(8, 2);
        rmapping.put(7, 3);
        rmapping.put(2, 4);
        rmapping.put(1, 5);
        rmapping.put(6, 6);
        rmapping.put(5, 7);
        rmapping.put(0, 8);
        rmapping.put(3, 9);

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            newArr[i] = (Integer) mapping.get(arr[i]);

        }

        Arrays.sort(newArr);

        for (int i = 0; i < newArr.length; i++) {

            res[i] = (Integer) rmapping.get(newArr[i]);

        }

        return res;

    }

    public static void main(String[] args) throws IOException {

        //int toBeSorted[] = {1, 2, 3, 5, 1};
        int toBeSorted[] = {7, 3, 2, 8, 4};

        int[] res;

        res = sortArray(toBeSorted);
        for (int res_i = 0; res_i < res.length; res_i++) {
            //System.out.println(String.valueOf(res[res_i]));

        }
        
        
        System.err.println("Minimum Denominations for 99 : "+minimumDenominations(99));
    }
}
