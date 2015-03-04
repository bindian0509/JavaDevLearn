package oops;

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		// test code for i++ and ++i
		int i , j;
		
		i=1; j =++i;
		System.out.println(" Value of i : "+i+" | value of j using ++i : "+j+" | Value of ++i : "+ ++i);
		i=1; j = i++;
		System.out.println(" Value of i : "+i+" | value of j using i++ : "+j+" | Value of i++ : "+ i++);
	}

}
