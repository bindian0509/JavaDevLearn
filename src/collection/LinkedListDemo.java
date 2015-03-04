package collection;
import java.util.*;
/**
 * @author Bharat Verma
 */
public class LinkedListDemo
{
	public static void printLinkedList (LinkedList p_ll)
	{
		System.out.println("------------------------------------------");
		System.out.println("Content of LinkedList : "+p_ll);
		System.out.println("Size of LinkedList = "+p_ll.size());
		System.out.println("------------------------------------------");
	}
	public static void main(String[] args)
	{
		LinkedList link=new LinkedList();
		link.add("a");
		link.add("b");
		link.add(new Integer(10));
		
		printLinkedList(link);

		link.offerFirst(new Integer(20));
		printLinkedList(link);

		link.addLast("c");
		printLinkedList(link);

		link.add(2,"j");
		printLinkedList(link);

		link.add(1,"t");
		printLinkedList(link);
		System.out.println("The Last element : "+link.getLast());
		
		link.offerLast(new Integer(123));
		printLinkedList(link);
		
		link.remove(3);
		printLinkedList(link);
		
		System.out.println("The First element : "+link.element());
	}
}