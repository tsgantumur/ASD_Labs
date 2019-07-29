package lab6.CoR;

public class CallRecord {
	private Customer customer;
	private Agent agent;
	private String requestInformation;
	private boolean isValid;
	private boolean isASalesLead;
	
	public CallRecord(Customer customer, Agent agent, String info)
	{
		this.customer = customer;
		this.agent = agent;
		this.requestInformation = info;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public Agent getAgent()
	{
		return agent;
	}
	
	public String getRequestInformation()
	{
		return requestInformation;
	}
	
	public void setIsValid(boolean value)
	{
		this.isValid = value;
	}
	
	public boolean getIsValid()
	{
		return isValid;
	}
	
	public void setIsSalesLead(boolean value)
	{
		this.isASalesLead = value;
	}
	
	public boolean getIsASalesLead()
	{
		return isASalesLead;
	}
	
	
}
