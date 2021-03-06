/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

/**
 *
 * @author Bharat
 */
public class RwCwSortedArrayFind {

    public static int search(int[][] arr, int x) {

        int n = arr.length;
        int i = 0, j = n - 1;  //set indexes for top right element
        while (i < n && j >= 0) {
            if (arr[i][j] == x) {
                System.out.println(" Found at arr[" + i + "][" + j+ "]");
                return 1;
            }
            if (arr[i][j] > x) {
                j--;
            } else //  if mat[i][j] < x
            {
                i++;
            }
        }
         System.out.println(" Not Found");
        return 0;
    }

    public static void main(String args[]) {
        int mat[][] = {{10, 20, 30, 40},
        {15, 25, 35, 45},
        {27, 29, 37, 48},
        {32, 33, 39, 50},};
        
        
        search(mat, 37);

    }
}
