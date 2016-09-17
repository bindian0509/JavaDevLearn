/**
 * 
 */
package interviews;

/**
 * @author bharat
 *
 */
public class Lion extends Huntable implements Predator {

	/**
	 * @param age
	 * @param weight
	 * @param length
	 * @param name
	 */
	/*public Lion(int age, int weight, int length, String name) {
		super(age, weight, length, name);
		// TODO Auto-generated constructor stub
	}
	 */
	public Lion() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see interviews.Predator#chasepray()
	 */
	@Override
	public void chasepray() {
		// TODO Auto-generated method stub
		System.out.println("LION is chasing some Pray !");

	}

	/* (non-Javadoc)
	 * @see interviews.Predator#eatPray()
	 */
	@Override
	public void eatPray() {
		// TODO Auto-generated method stub
		System.out.println("lion is eating his pray ! ");

	}
	
	public void roar () {
		System.out.println("Lion is roaring !");
	}
	
	
	// EXTRA FEATURES 
	 int dangerLimit = 34;
	
	int numofLegs  = 4 ;
	
	double theSpeed = 110;
	
	
	public int getLegs() {
		return this.numofLegs;
		
	}
	
	public void setLegs (int legs) {
		
		this.numofLegs = legs ;
 		
	}
	
	
	public double getSpeed () {
		
		return this.theSpeed;
	}
	
	public void setSpeed (double speed) {
		this.theSpeed = speed;
	}
	
	
	//Constructor for Lion Class
	
	
	
	public Lion (int legs, double speed) {
		
		this.numofLegs = legs;
		this.theSpeed = speed;
		
	}
	
	
	
	
    public void setDangerLimit (int dangerLimit ) {
    	this.dangerLimit = dangerLimit;
    }
	
	public int getDangerLimit() {
		return this.dangerLimit ;
	}
	
	
	
	
	
	
	
}
