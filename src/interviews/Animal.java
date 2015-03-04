package interviews;

public class Animal {	
	
	
	// Properties of Animal (Members)
	
	/*
	 * Private - Accessible only within the class
	 * Public - Accessible within the class and to another classes 
	 * Protected - Accessible within the class and to sub classes (children classes)
	 */
	
	private int age ;
	private int length ;
	private String name ;
	private int weight ;
	
	public static int numAnimals ;
	
	
	public Animal (int age, int weight, int length, String name) {
		this.age = age;
		this.length = length;
		this.weight = weight;
		this.name = name;
		numAnimals++;
	}
	
	public Animal () {
		numAnimals++;
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 )
		this.age = age;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length > 0)
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if (weight > 0)
		this.weight = weight;
	}


	
	// Methods (what animal could do)
	
	void eat (String food) {
		System.out.println("Animal is eating "+food);
	}
	
	void sleep () {
		System.out.println ("Animal is sleeping ! ");
	}
	
	void breathe () {
		System.out.println("Animal is breathing ! ");
	}
	
}
