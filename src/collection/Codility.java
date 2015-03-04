package collection;

public class Codility 
{

	static int equi ( int[] A ) 
	{
		int equlibrium = 0;
		int sum = 0, partBeforeP=0, partAfterP=0, p=1;

		for (int j = 0; j < A.length; j++)
		{
			sum = sum + A[j];
		}

		while (p < A.length)
		{
			for ( int i=0; i < p; i++ )
				partBeforeP = partBeforeP + A[i];
			for ( int i=p; i < A.length; i++ )
				partAfterP = partAfterP + A[i];

			if (partAfterP == partBeforeP)
			{
				System.out.println("Found it as == !!");
				break;
			}
			/*else if ( sum == 0)
			{
				System.out.println("Found it as 0!!");
				break;
			}*/
			p++;

		}


		return p;
		// write your code here
	}

	public static void main ( String args[])
	{
		int potPourri[] = {-7,1,5,2,-4,3,0};

		System.out.println(equi(potPourri));
	}

}
