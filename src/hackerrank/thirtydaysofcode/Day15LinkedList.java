/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;

import java.util.Scanner;

/**
 *
 * @author BHARAT VERMA <bharat.verma@shopclues.com>
 */
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class Day15LinkedList {

    public static Node insert(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            head.next = null;
            return head;
        }
        Node temp = head;
        while (head.next != null) {
            head = head.next;
        }
        head.next = new Node(data);
        return temp;

    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }

}
