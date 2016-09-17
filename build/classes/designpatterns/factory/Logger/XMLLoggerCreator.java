package designpatterns.factory.Logger;

//ConcreteCreator
public class XMLLoggerCreator extends AbstractLoggerCreator{

	@Override
	public Logger createLogger() {
		XMLLogger logger = new XMLLogger();
		return logger;
	}

}