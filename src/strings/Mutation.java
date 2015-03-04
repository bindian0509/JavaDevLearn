
package strings;

import java.awt.Point;

/**
 * @author bharat
 *
 */
public class Mutation {


	public static void main(String[] args) {
		
		// Mutable class
		Point myPoint = new Point( 0, 0 );
		System.out.println( myPoint );
		myPoint.setLocation( 1.0, 0.0 );
		System.out.println( myPoint );

		// Immutable class
		String myString = new String( "old String" );
		System.out.println( myString );
		myString.replaceAll( "old", "new" );
		System.out.println( myString );
		
		// How can we change it then -- THE HARD WAY
		
		String myStringNew = new String( "old String" );
		System.out.println( myStringNew );
		myStringNew = new String( "new String" );
		System.out.println( myStringNew );
		
		
		// Extending the examples 
		
		String myStringOther = new String( "old String" );
		String myCache = myStringOther;
		System.out.println( "equal: " + myStringOther.equals( myCache ) );
		System.out.println( "same:  " + ( myStringOther == myCache ) );

		myStringOther = "not " + myStringOther;
		System.out.println( "equal: " + myStringOther.equals( myCache ) );
		System.out.println( "same:  " + ( myStringOther == myCache ) );
		
		
		String no = null;
		
		
		System.out.println (myString.equals(null)) ;
			
		
	}

}
