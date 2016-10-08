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
class BNode {

    BNode left, right;
    int data;

    BNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Day22BinarySearchTree {

    public static int getHeight(BNode root) {
        //Write your code here
        if(root == null) 
            return -1;
        
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        
        if(leftHeight > rightHeight)
            return leftHeight+1;
        else
            return rightHeight+1;
    }

    public static BNode insert(BNode root, int data) {
        if (root == null) {
            return new BNode(data);
        } else {
            BNode cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BNode root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }

}
