/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author BHARAT VERMA <>
 */
public class Day26NestedLogics {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String [] actdate = sc.nextLine().split("\\s");
        
        String [] enddate = sc.nextLine().split("\\s");
        
        
        int da = Integer.parseInt(actdate[0]);
        int ma = Integer.parseInt(actdate[1]);
        int ya = Integer.parseInt(actdate[2]);
        
        
        int de = Integer.parseInt(enddate[0]);
        int me = Integer.parseInt(enddate[1]);
        int ye = Integer.parseInt(enddate[2]);
        
        
        
        if(ya > ye) {
            System.out.println("10000");
            
        } else if (ya == ye && ma > me) {
            System.out.println((ma-me)*500);            
        }
        else if (ma == me && da > de) {
            System.out.println((da-de)*15);            
        }
        else {
            System.out.println(0);
            
        }
        
        
        
        
    }
}
