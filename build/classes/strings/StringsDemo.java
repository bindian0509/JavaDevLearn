package strings;
/**
 * 
 */

/**
 * @author bharat
 *
 */
public class StringsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		
		
		
		String s1 = "Hello";
		
		String s2 = "Hello";
					
		String s3 = new String("Hello");
		
		
		if(s1 == s2)
			System.out.println("True when s1 and s2 compared.");
		
		if(s1.equals(s3))
			System.out.println("True when s1 and s3 compared.");
		
		StringBuffer strbuff = new StringBuffer();
		
		
		String abc = "My Eclipse is best ";
		
		char [] CharABC = {'B', 'H', 'A','R','A','T' };

		
		String x1 = "America";
		
		String x2 = "Russia";
		
		if (x1 == x2) {
			System.out.println("String Equals");
			
		}
		else {
			System.out.println("String not equals.");

		}
		
		String ObjABC = new String ("That was my name !");
		
		
		System.out.println(abc.intern());
		
		System.out.println(CharABC);
		
		//CharABC[] = "Phir le aaya dil";
		
		System.out.println(abc+x1);
		String some = abc+x2;
		System.out.println(some);

		String strPassword="Unknown";
		char[] charPassword= new char[]{'U','n','k','w','o','n'};
		System.out.println("String password: " + strPassword);
		System.out.println("Character password: " + charPassword);

		//Read more: http://javarevisited.blogspot.com/2012/03/why-character-array-is-better-than.html#ixzz26yvvT1lN

		
		System.out.println(ObjABC);
	}

}
