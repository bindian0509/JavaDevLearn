package interviews;

public class Animal_driver {
	
	
	public static void main (String args[]) {
		Animal doggiee = new Animal();
		
		doggiee.setName("Rover");
		doggiee.setAge(3);
		doggiee.setLength(36);
		doggiee.setWeight(40);
		
		
		doggiee.breathe();
		
		doggiee.eat("Pedegree");
		
		doggiee.sleep();
		
		
		System.out.println("Animal Name is : "+doggiee.getName());
		System.out.println("Animal's Age : "+doggiee.getAge());
		System.out.println("Animal's Length : "+doggiee.getLength());
		
		
		
		Animal kitty = new Animal (5,23,30, "Kitty Darling");
		
		System.out.println("Second Animal's Name is "+kitty.getName());
		
		kitty.eat("Shrimps");
		
		
		Fish goldfish = new Fish(1, 2, 1, "Goldie",  true);
		
		System.out.println("The fish's name is: " + goldfish.getName());
		goldfish.setWeight(2);
		System.out.println("The fish's weight is: " + goldfish.getWeight());
		
		goldfish.swim();
		
		goldfish.getChase();
		
		
		//Lion myLion = new Lion (20, 34, 430, "Alex");
		
		//myLion.eatPray();
		
		//myLion.roar();
		
		
		
		Lion newLion = new Lion (4, 113);
		
		newLion.setDangerLimit(23);
	
		
		System.out.println("Lion's Legs in numbers : " + newLion.getLegs());

		System.out.println("Lion's speed in KMPH : " + newLion.getSpeed());

		System.out.println("Lion's danger Limit : " + newLion.getDangerLimit());

		System.out.println("Number of Animals produced : "+Animal.numAnimals);
		
	}

}
