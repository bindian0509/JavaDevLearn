package interfaces;

public class Adapter implements InterfaceOne {
	
	void turnLeft() {}
	void turnRight() {}
	void moveBack() {}
	void accelerate() {}
	
	public void m1(int i, int j , int k ) {
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
}
