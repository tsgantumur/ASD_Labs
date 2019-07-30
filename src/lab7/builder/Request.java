package lab7.builder;

public class Request {
	private String reqId;
	private Customer requester;
	private Agent agent;
	private String reqContent;
	private String respContent;
	private boolean isAnswered;
	private boolean isSaleLead;
	private boolean needCallBack;
	
	public Request()
	{
	}
	
	public String getReqId()
	{
		return this.reqId;
	}
	
	public void setReqId(String reqId)
	{
		this.reqId = reqId;
	}
	
	public void setRequester(Customer requester)
	{
		this.requester = requester;
	}
	
	public Customer getRequester()
	{
		return this.requester;
	}
	
	public void setAgent(Agent agent)
	{
		this.agent = agent;
	}
	
	public Agent getAgent()
	{
		return this.agent;
	}
	
	public void setReqContent(String req)
	{
		this.reqContent = req;
	}
	
	public String getReqContent()
	{
		return reqContent;
	}
	
	public void setRespContent(String resp)
	{
		this.respContent = resp;
	}
	
	public String getRespContent()
	{
		return this.respContent;
	}
	
	public void setIsAnswered(boolean isAnswered)
	{
		this.isAnswered = isAnswered;
	}
	
	public boolean getIsAnswered()
	{
		return this.isAnswered;
	}
	
	public void setIsSaleLead(boolean isSaleLead)
	{
		this.isSaleLead = isSaleLead;
	}
	
	public boolean getIsSaleLead()
	{
		return this.isSaleLead;
	}
	
	public void setNeedCallBack(boolean needCallBack)
	{
		this.needCallBack = needCallBack;
	}
	
	public boolean getNeedCallBack()
	{
		return this.needCallBack;
	}
}
