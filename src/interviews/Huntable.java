/**
 * 
 */
package interviews;

/**
 * @author bharat
 *
 */
public abstract class Huntable {
	
	boolean animalHuntable = true;
	
	public int somevar = 0;
	
	
	public void youHunted () {
		
		this.animalHuntable = false ;
	}

	
	public abstract void setDangerLimit (int dangerLimit ) ;
	
	public abstract int getDangerLimit() ; 
}
