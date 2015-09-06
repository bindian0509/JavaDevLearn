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
public class Driver {

    static Object lock = new Object();
    public static final int N = 10;
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 1; itr < N+1; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.println("Printed from odd thread  " + itr);
                        try {
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                for (int itr = 2; itr < N+1; itr = itr + 2) {
                    synchronized (lock) {
                        System.out.println("Printed from even thread " + itr);
                        try {
                            lock.notify();
                            if (itr == N) {
                                break;
                            }
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        try {
            
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("\nPrinting over");
        } catch (Exception e) {

        }
    }
}
