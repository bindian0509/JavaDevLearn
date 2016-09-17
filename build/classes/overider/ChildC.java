package overider;

public class ChildC extends ParentC {

	/**
	 * @param args
	 */

	// Non static over riding 
	public void printDesc () {
		super.printDesc();
		System.out.println("this is the printDesc from child class !");
	
	}
	
	public static void gameon () {
		System.out.println("this is the static gameon from child class !");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		gameon(); // this is called static over riding or method hiding
		
		player(2, 2);
		
		ChildC cc = new ChildC();
		
		cc.printDesc();

	}

}
