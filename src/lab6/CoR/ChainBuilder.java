package lab6.CoR;

public class ChainBuilder {
	private IChain handler;
	
	public void buildChain()
	{
		IChain junior = new Validator();
		IChain senior = new DataWasher();
		
		IChain superVisor = new Reporter();
		
		junior.setNext(senior);
		senior.setNext(superVisor);
		handler = junior;
	}
	
	public IChain getHandler()
	{
		return handler;
	}
}
