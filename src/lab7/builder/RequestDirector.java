package lab7.builder;

public class RequestDirector {
	private RequestBuilder requestBuilder = null;
	
	public RequestDirector(RequestBuilder requestBuilder)
	{
		this.requestBuilder = requestBuilder;
	}
	
	public void constructRequest()
	{
		requestBuilder.openRequest();
		requestBuilder.buildResponse();
		requestBuilder.closeRequest();
	}
	
	public Request getRequest()
	{
		return requestBuilder.getRequest();
	}

}
