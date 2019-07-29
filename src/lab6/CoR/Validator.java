package lab6.CoR;

public class Validator implements IChain {
	private IChain chain;
	@Override
	public void setNext(IChain nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;
	}

	@Override
	public void process(CallRecord callRecord) {
		// TODO Auto-generated method stub
		if(callRecord.getCustomer().getAddress() != null &&
				callRecord.getCustomer().getPhone() != null
				&& callRecord.getCustomer().getEmail() != null)
		{
			callRecord.setIsValid(true);
			chain.process(callRecord);
		}
		else
		{
			System.out.println("Invalid Personal Information");
			callRecord.setIsValid(false);
		}
	}

}
