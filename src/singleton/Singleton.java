package singleton;

import java.io.Console;
import java.util.logging.ConsoleHandler;

public class Singleton {
	
	public static Singleton _obj ;
	
	
	// prevent external initialization 
	private Singleton() {
		
	}
	
	public static Singleton getObject() {
		
		if(_obj == null)
			_obj = new Singleton();
		
		return _obj;
	}
	
	public void printing (String s) {
		System.out.println(s);
	}

}
