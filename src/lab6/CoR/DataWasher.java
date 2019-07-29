package lab6.CoR;

public class DataWasher implements IChain {
	private IChain chain;

	@Override
	public void setNext(IChain nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;
	}

	@Override
	public void process(CallRecord callRecord) {
		// TODO Auto-generated method stub
		if(callRecord.getIsValid())
		{
			callRecord.setIsSalesLead(true);
			chain.process(callRecord);
		}
		else
		{
			System.out.println("Invalid");
			callRecord.setIsSalesLead(false);
		}
	}

}
