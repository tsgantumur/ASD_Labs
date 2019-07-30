package lab7.builder;

public class BuilderClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RequestDirector director = new RequestDirector(new RequestBuilder());
		
		director.constructRequest();
		Request request = director.getRequest();
		
		System.out.println("Req Id: " + request.getReqId());
		System.out.println("Requester name: " + request.getRequester().getFirstName() + " " + request.getRequester().getLastName());
		System.out.println("Request contents: " + request.getReqContent());
		System.out.println("Agent response: " + request.getRespContent());
		System.out.println("Agent name: " + request.getAgent().getFirstName() + " " + request.getAgent().getLastName());
		System.out.println("Answered: " + request.getIsAnswered());
		System.out.println("SaleLead: " + request.getIsSaleLead());
		System.out.println("NeedCallBack: " + request.getNeedCallBack());
	}

}
