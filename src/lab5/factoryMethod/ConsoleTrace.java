package lab5.factoryMethod;

public class ConsoleTrace implements Trace {

	@Override
	public void setDebug(boolean debug) {
		// TODO Auto-generated method stub
		System.out.println("Console Trace set debug " + debug);
	}

	@Override
	public void debug(String message) {
		// TODO Auto-generated method stub
		System.out.println("Console Trace is debugging " + message);
	}

	@Override
	public void error(String message) {
		// TODO Auto-generated method stub
		System.out.println("Console Trace error: " + message);
	}

}
