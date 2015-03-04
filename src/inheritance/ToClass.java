package inheritance;

public class ToClass extends FromClass
{
	

	
	public static void main(String[] args) 
	{
		FromClass upperBharat = new ToClass();
		FromClass upperupper = new FromClass();
		ToClass bharatbharat = new ToClass();

		upperBharat.staticMethod(); //FromClass : inside staticMethod

		upperupper.staticMethod(); // FromClass : inside staticMethod

		bharatbharat.staticMethod(); // BharatUtil : inside staticMethod

		staticMethod(); // BharatUtil : inside staticMethod

		int[] attendance = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("atten mean : " + FromClass.mean(attendance));

		//methodUsingStaticFieldsofFromClass()

	}

}
