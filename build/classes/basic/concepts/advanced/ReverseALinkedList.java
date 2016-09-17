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
public class ReverseALinkedList {

    public Node head;

    public class Node {

        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node [value : " + this.value + " ]";
        }
    }

    // Methods for Linked List 
    public Node add(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return newNode;
        }
        newNode.next = head;
        head = newNode;

        return newNode;

    }

    public void reverseRecusive() {

        reverseRecusiveHelper(this.head, null);
    }

    public void reverseRecusiveHelper(Node head, Node prev) {

        if (head == null) {
            this.head = prev;
            return;
        }
        reverseRecusiveHelper(head.next, head);
        head.next = prev;
    }

    public String toString() {

        StringBuffer sb = new StringBuffer();

        sb.append("[");
        Node current = this.head;
        while (current != null) {
            sb.append(current.value);
            current = current.next;

            if (current != null) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Simple recursive method to turn around linked list
    public void reverse() {
        Node head = this.head;

        Node temp = null;

        Node nextNode = null;

        while (head != null) {
            nextNode = head.next;
            head.next = temp;
            temp = head;
            head = nextNode;
        }
        this.head = temp;
    }

    public static void main(String[] args) {

        ReverseALinkedList ll = new ReverseALinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println(ll);
        ll.reverse();
        System.out.println(ll);
    }

}
