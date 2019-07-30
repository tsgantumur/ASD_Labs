package lab7.builder;

public interface IRequestBuilder {
	public void openRequest();
	public void buildResponse();
	public void closeRequest();
	public Request getRequest();
}
