package lab7.builder;

public class RequestBuilder implements IRequestBuilder {
	private Request request = null;
	
	private Call call = null;
	private Agent agent = null;
	
	public RequestBuilder()
	{
		request = new Request();
		agent = new Agent("A", "B");
		call = new Call();
		call.callPop(agent);
	}
	
	public void openRequest()
	{
		Customer customer = new Customer("Gana", "Tse", "641-000-1010");
		request.setReqId(call.getRequestId());
		request.setRequester(customer);
		request.setAgent(agent);
		request.setReqContent("Customer is requesting...");;
	}
	
	public void buildResponse()
	{
		request.setRespContent("Agent is responsing...");
	}
	
	public void closeRequest()
	{
		request.setIsAnswered(true);
		request.setNeedCallBack(false);
		request.setIsSaleLead(false);
	}
	
	public Request getRequest()
	{
		return this.request;
	}
}
