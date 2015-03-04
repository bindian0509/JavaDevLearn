
package strings;

/**
 * @author bharat
 *
 */
public class StringBufferBuilder {

	/**
	 * @author bharat
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		
		StringBuffer strBuff = new StringBuffer("SELECT name, id, class, rollno, school ");
		
		StringBuilder strBuild = new StringBuilder("SELECT name, id, class, rollno, school ");
		
		strBuff.append("FROM students WHERE 1");
		
		strBuild.append("FROM teachers WHERE 1");
		
		
		System.out.println(strBuff.toString());
		
		System.out.println(strBuild.toString());
		
		

		

	}

}
