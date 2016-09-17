package interviews;

import java.util.ArrayList;

public class Arrays {
	
/*	public void helloEdureka(int x) 
	{ 
	    int trueValue = 1; 
	    if(trueValue) 
	    {
	        System.out.println("Good"); 
	    } 
	    else 
	    {
	        System.out.println("Bad"); 
	    } 
	}
*/
	 public static void main(String[] args)
	    {
	        int[] agesOfFamily;
	        agesOfFamily = new int[6];
	        
	        agesOfFamily[0] = 37;
	        agesOfFamily[1] = 69;
	        agesOfFamily[2] = 65;
	        agesOfFamily[3] = 31;
	        agesOfFamily[4] = 4;
	        agesOfFamily[5] = 2;
	        
	        System.out.println("My adorable nephew is " + agesOfFamily[5] + " years old");
	        
	        String[] familyMembers;
	        familyMembers = new String[5];
	        
	        familyMembers[0] = "Mark";
	        familyMembers[1] = "Joan";
	        familyMembers[2] = "Rick";
	        familyMembers[3] = "Brett";	
	        familyMembers[4] = "Rose";
	        
	        System.out.println("My grandmother's name is " + familyMembers[4]);   
	         
	        for(int i=0; i < familyMembers.length; i++)
	        {
	            System.out.println(familyMembers[i]);
	        }
	    
	        
	        ArrayList airlines = new ArrayList();
	        
	        System.out.println("Array list airline initial size: " + airlines.size());
	        airlines.add("American");
	        airlines.add("Delta");
	        airlines.add("United");
	        airlines.add("US Airways");
	        airlines.add("jetBlue");
	        airlines.add("Southwest");
	        System.out.println("Array list airline initial size: " + airlines.size());
	        System.out.println("Airlines in the list: " + airlines);
	        
	        System.out.println("The first airline: " + airlines.get(0));
	        System.out.println("The last airline: " + airlines.get(5));
	        
	        airlines.remove(3);
	        
	        System.out.println("The third airlines is now: " + airlines.get(3));
	        

	         /*
	        	agesOfFamily = new int[3];
	        	agesOfFamily[0] = 37;
	        	agesOfFamily[1] = 69;
	        	agesOfFamily[2] = 65;
	        	agesOfFamily[3] = 99;

	        	        System.out.println("My grandfather is + " + agesOfFamily[3] + " years old"); */
	        	    	agesOfFamily = new int[3];
	        	    	agesOfFamily[0] = 37;
	        	    	agesOfFamily[1] = 69;
	        	    	agesOfFamily[2] = 65;

	        	    	        System.out.println("My adorable nephew is + " + agesOfFamily[2] + " years old");
	         
	    }

}
