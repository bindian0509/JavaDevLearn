/**
 * 
 */
package interfaces;

/**
 * @author bharat
 *
 */
public class ImplementarClass extends MasterClass implements InterfaceOne, InterfaceTwo {

	/**
	 * @param args
	 */
	public void m1(int i, int j, int k) {
		System.out.println("Hey ! method m1 is used");
	}
	
    public void m2() {
    	System.out.println("Hey ! method m2 is used");
    }
    
    public void m3() {
    	System.out.println("Hey ! method m3 is used");
    }
    
    public void m4() {
    	System.out.println("Hey ! method m4 is used");
    }
    
    public void m5() {
    	System.out.println("Hey ! method m5 is used");
    }
    
	public static void main(String[] args) {
		
		System.out.println("Value of the v1 variable : "+v1);
		System.out.println("Value of the v2 variable : "+v2);
		
		
		MasterClass masterObj = new ImplementarClass();
		
		int answer = masterObj.doMaths(23, 32);
		System.out.print(answer);
		InterfaceOne i1 = new ImplementarClass();
		
		i1.m1(1, 2, 3);
				
		InterfaceTwo i2 = new ImplementarClass();
		
		i2.m5();
		
		
	}
	
	

}
