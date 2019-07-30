package lab7.builder;

import java.util.Date;

public class Call {
	private String requestId;
	private Agent agent;
	
	public Call() {}
	
	public void callPop(Agent agent)
	{
		this.agent = agent;
		this.requestId = ""+ (new Date()).getTime();
	}
	
	public String getRequestId()
	{
		return this.requestId;
	}
	
	public Agent getAgent()
	{
		return this.agent;
	}
	
	
}
