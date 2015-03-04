package imported;

public class IntegerNumber
{
	public static void main (String args[])
	{
		int _intValue = 77;

		int _intNumArray[] = new int[(Integer.toString(_intValue)).length()];
		System.out.println("--------------------------------------------------------");
		System.out.println("\nInteger Value to String : "+ Integer.toString(_intValue));
		System.out.println("--------------------------------------------------------");
		System.out.println("Integer Value to String's length : "+ Integer.toString(_intValue).length());
		System.out.println("-------------[ int to string to string buffer and then reverse]-------------------------------------------");
		System.out.println("Integer Value to String's length : "+ new StringBuffer(Integer.toString(_intValue)).reverse());

		String _stringToFeedStringBuffer = new String("");

		StringBuffer _stringBufferDemo = new StringBuffer();

		_stringBufferDemo.append("Lafangey... ");
		_stringBufferDemo.append("Parindey... !!");
		System.out.println("--------------------------------------------------------");
		System.out.println("The reverse output of String Buffer Demo : "+_stringBufferDemo.reverse().toString());
		System.out.println("--------------------------------------------------------");
		System.out.println("The output of String Buffer Demo : "+_stringBufferDemo.reverse().toString());
		System.out.println("--------------------------------------------------------");
	}
}