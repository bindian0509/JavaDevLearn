package designpatterns.factory.Logger;

public class Client {
	private void someMethodThatLogs(AbstractLoggerCreator logCreator)
	{
		Logger logger = logCreator.createLogger();
		logger.log("message");
		
	}
	
	public static void main(String[] args)
	{
		//for the purposes of this example, create an XMLLoggerCreator directly, 
		//but this would normally be passed to constructor for use.
		AbstractLoggerCreator creator = new XMLLoggerCreator();
		
        int [][] abc = {{2,3, 4}, {1,2}};

        System.out.println(abc);

		
		Client client = new Client();
		client.someMethodThatLogs(creator);
	}
	
}
