package interviews;

public class JavaVariables {
	
	// Java is a strongly typed languages ! 
	public static void main (String args[]) {
		
	  int age;        //Variable Declaration
      age= 37;
      
      float gpa = 3.77f;       //Delcaration and Initialization
      
      double preciseNumner = 1.000005;
      
      byte score = 12;
      
      short tennisScore = 30;
      
      long socialSecNumber = 650162727;
      
      boolean isPlaying = true;
      
      char letterGrade = 'A';
      
      System.out.println("Our integer value is: " + age);
      System.out.println("Our floating point value is: " + gpa);
      System.out.println("Out boolean value is: " + isPlaying);
      
      /*
          Aritmetic Operators
          
          +, - , *, /
          
          ++      Increment Operator adds One
          --      Decrement Operator subtracts One
          %       Modulus Operator
       
          Combined Assignment Operators
          
          +=      Add (or concatenate) and then assign
          -=      Subtract then Assign
          *=      Multiply then Assign
          /=      Divide then Assign
      
      
      */  
      
      
      System.out.println("Next year I will be " + (++age));
      System.out.println("17 % 3 = " + (17%3));
      
      tennisScore += 10;      //tennisScore = tennisScore+10;
      
      System.out.println("Tennis Score= " + tennisScore);

      // Switch Case demo
      
      char mode = 'S';
      
      
      switch (mode) {
      case 'A' : 
    	  System.out.println("Outstanding Achievements !");
          break;
      
      case 'B' : 
    	  System.out.println("Can do well Satisfactory Achievements ! ");
          break;
          
      case 'C' :
    	  System.out.println("Fuck yourself Achievements !");
    	  break;
    	  
      default: 
    	  System.out.println("You suck !!");
      }
	
      
      // while loop demo
      int x = 1;
      
      while (x <= 100){
    	  System.out.println(x);
    	  x++;
      }
      
      // do-while loop demo
      
      
      int z = 300 ;
      
      do {
    	  
    	  System.out.println(z);
    	  z += 5;
    	  
    	  
      } while(z<250);
      
      // for loop demo 
      
      for (int i = 0; i < 100 ; i=i+5) {
    	  
    	System.out.println(i);  
      }
      
      
	}
}
