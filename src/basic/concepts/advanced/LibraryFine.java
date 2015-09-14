/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

import java.time.Clock;
import java.util.Scanner;

/**
 *
 * @author Bharat
 */
public class LibraryFine {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String actualReturnDate = in.nextLine();
        String expectedReturnDate = in.nextLine();

        String[] ard = actualReturnDate.split(" ");
        String[] erd = expectedReturnDate.split(" ");

        if (!ard[2].equals(erd[2])) {
            int diffYear = Integer.parseInt(ard[2]) - Integer.parseInt(erd[2]);
            if(diffYear > 0)
                System.out.println("10000");
            else
                System.out.println(0);
                        
        } else if (!ard[1].equals(erd[1])) {
            int diffMOn = Integer.parseInt(ard[1]) - Integer.parseInt(erd[1]);

            if (diffMOn > 0) {
                int fine = diffMOn * 500;
                System.out.println(fine);
            } else {
                System.out.println(0);
            }
        } else if (!ard[0].equals(erd[0])) {
            int diffDays = Integer.parseInt(ard[0]) - Integer.parseInt(erd[0]);
            if (diffDays > 0) {
                int fine = diffDays * 15;
                System.out.println(fine);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }

    }
}
