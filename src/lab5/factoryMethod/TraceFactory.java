package lab5.factoryMethod;

public class TraceFactory implements ITraceFactory {
	private static TraceFactory instance = null;
	
	private TraceFactory() {}
	
	public static TraceFactory getInstance()
	{
		if(instance == null)
			return new TraceFactory();
		
		return instance;
	}
	
	public Trace createTrace(String type)
	{
		Trace trace = null;
		
		if(type.equals("trace.log"))
		{
			trace = new FileTrace();
		}
		else if(type.equals("console")) {
			trace = new ConsoleTrace();
		}
		
		return trace;
	}
}
