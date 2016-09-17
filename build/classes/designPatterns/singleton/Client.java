package designPatterns.singleton;

public class Client {
	 
	  public static void main(String[] args)
	  {
	 
	      AccountCreation tc = AccountCreation.getInstance();
	      AccountCreation tc1 = AccountCreation.getInstance();
	 
	      tc.create(12345);
	      tc1.create(67891);
	      
	      
	      
	      // Singleton implementation from wikipedia
	      Singleton s = Singleton.getObject();
	      
	      Singleton ass = Singleton.getObject();
	      
	      
	      if(s.equals(ass)) 
	    	  System.out.println("Yes s and ass are equals ! ");
	      
	      s.printing("Hello there consolers logger ... ");
	      ass.printing("Hello there consolers logger and naives ... ");
	 
	  }
}