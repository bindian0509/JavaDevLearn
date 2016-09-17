package strings;

public class WhyEquals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// These two have the same value
		System.out.println(new String("test").equals("test")) ;//==> true 

		// ... but they are not the same object
		System.out.println(new String("test") == "test"); //==> false 

		// ... neither are these
		System.out.println(new String("test") == new String("test")); // ==> false 

		// ... but these are because literals are interned by 
		// the compiler and thus refer to the same object
		System.out.println("test" == "test"); //==> true 

		// concatenation of string literals happens at compile time resulting in same objects
		System.out.println("test" == "te" + "st"); //  ==> true

		// but .substring() is invoked at runtime, generating distinct objects
		System.out.println("test" == "!test".substring(1)); // ==> false

		
		String a = null ;
		
		if ("".equals(a)) {
			System.out.println("true");
		}
	}

}
