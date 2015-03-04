package overider;



public class ParentC {
	
	public static void player (int a , int b) {
		System.out.println("Players rating "+a+b);
	}
	
	
	public static void gameon ( ) {
		
		System.out.println("this is the static gameon from parent class !");
	}
	
	
	// Non static over riding 
	public void printDesc () {
		System.out.println("this is the printDesc from parent class !");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		gameon();
		
		player(2, 2);

	}
}
