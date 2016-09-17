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
import java.util.*;

class Synch {

    synchronized int locking(int a, int b) {
        return a + b;
    }

    int not_locking(int a, int b) {
        return a + b;
    }

    private static final int ITERATIONS = 1000000;

    static public void main(String[] args) {
        Synch tester = new Synch();
        double start = new Date().getTime();
        for (long i = ITERATIONS; --i >= 0;) {
            tester.locking(0, 0);
        }
        double end = new Date().getTime();
        double locking_time = end - start;
        start = new Date().getTime();
        for (long i = ITERATIONS; --i >= 0;) {
            tester.not_locking(0, 0);
        }
        end = new Date().getTime();
        double not_locking_time = end - start;
        double time_in_synchronization = locking_time - not_locking_time;
        System.out.println("Time lost to synchronization (millis.): "
                + time_in_synchronization);
        System.out.println("Locking overhead per call: "
                + (time_in_synchronization / ITERATIONS));
        System.out.println(
                Math.round(not_locking_time / locking_time * 100.0) + "% increase");
    }
}
