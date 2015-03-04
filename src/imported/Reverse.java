package imported;

public class Reverse
{
	public static void main(String args[])
	{
		int i,s=0,a = 120;
		int no[] = new int[10];
		System.out.print("Original Number : "+a);
		for(i=0;i< 10;i++)
		{
			if(a!= '\0')
			{	
				no[i] = a%10;
				a = a / 10;
				s++;
			}	
			else break;
		}
		System.out.print("\n\nReversed Number : ");
		for(i=s;i>0;i--)
		{
			System.out.print(no[i]);
		}
	}
}