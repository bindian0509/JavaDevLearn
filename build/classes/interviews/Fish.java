package interviews;

public class Fish extends Animal implements Pray{

	boolean scales;
	
	
	public Fish(int age, int length,  int weight, String name, boolean scales)
	{
		super(age, length, weight, name);
		this.scales = scales;
	}
	
	public Fish()
	{
		
	}
	
	//New Method specific to the fish class
	public void swim()
	{
		System.out.println("Fish is swimming");
	}
	
	
	//Overriding the method in the parent
	public void breathe()
	{
		System.out.println("Fish is breathing through its gills");
	}

	@Override
	public void getChase() {
		// TODO Auto-generated method stub
		System.out.println("Fish is being chased !");
		
	}

	@Override
	public void getEaten() {
		// TODO Auto-generated method stub
		System.out.println("Fish is being eaten !");
		
	}
	
	
	
	
}
