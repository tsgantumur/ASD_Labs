package lab7.builder;

public class Agent {
	private String firstName;
	private String lastName;
	
	public Agent(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
}
