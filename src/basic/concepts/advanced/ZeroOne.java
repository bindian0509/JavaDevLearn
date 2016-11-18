/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.concepts.advanced;

/**
 *
 * @author BHARAT VERMA <bharat.verma@shopclues.com>
 */
public class ZeroOne {

    static String Zero_One(int num) {
        long mult = 1;

        while (true) {
            long product = mult++ * num;
            long temp = product;
            while (temp != 0) {
                long digit = temp % 10;
                if (digit != 0 && digit != 1) {
                    break;
                }
                temp /= 10;
            }
            if (temp == 0) {
                return Long.toString(product);
            }
        }

    }

    static int nonLeadingZeroComplement(int i) {
        int ones = (Integer.highestOneBit(i) << 1) - 1;
        System.out.println(Integer.highestOneBit(i) << 1);
        return i ^ ones;
    }

    public static void main(String[] args) {

        System.out.println("For 100 its : " + nonLeadingZeroComplement(511));

    }

}
