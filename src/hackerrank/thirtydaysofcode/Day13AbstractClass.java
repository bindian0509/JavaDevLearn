/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.thirtydaysofcode;


import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

class MyBook extends Book {

    int price;
    
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    @Override
    public void display() {
        System.out.println("Title: "+super.title);
        System.out.println("Author: "+super.author);
        System.out.println("Price: "+this.price);
    }
    
    
    
}

/**
 *
 * @author BHARAT VERMA <>
 */
public class Day13AbstractClass {
 
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }   
}
