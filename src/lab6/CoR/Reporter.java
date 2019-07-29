package lab6.CoR;

public class Reporter implements IChain {
	private IChain chain;
	@Override
	public void setNext(IChain nextChain) {
		// TODO Auto-generated method stub
		this.chain = nextChain;
	}

	@Override
	public void process(CallRecord callRecord) {
		// TODO Auto-generated method stub
		if(callRecord.getIsASalesLead())
		{
			System.out.println("Personal Info: " + callRecord.getCustomer().getFirstName() + " "
					+ callRecord.getCustomer().getLastName() + " "
					+ callRecord.getCustomer().getAddress().getStreetAddress() + " "
					+ callRecord.getCustomer().getAddress().getCity() + " "
					+ callRecord.getCustomer().getAddress().getState() + " "
					+ callRecord.getCustomer().getAddress().getZipcode());
			System.out.println("Request Info: " + callRecord.getRequestInformation());
			System.out.println("Valid: " + callRecord.getIsValid());
			System.out.println("A Sales lead: " + callRecord.getIsASalesLead());
		}
		else
		{
			System.out.println("Can not generate A sales lead!");
			System.out.println("A Sales Lead is: " + callRecord.getIsASalesLead());
		}
	}

}
