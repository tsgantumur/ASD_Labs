package lab5.factoryMethod;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraceFactory tf = TraceFactory.getInstance();
		
		Trace consoleTrace = tf.createTrace("console");
		consoleTrace.setDebug(true);
		consoleTrace.debug("a");
		consoleTrace.error("b");
		
		Trace fileTrace = tf.createTrace("trace.log");
		fileTrace.setDebug(true);
		fileTrace.debug("c");
		fileTrace.error("d");
	}

}
