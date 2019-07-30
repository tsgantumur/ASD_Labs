package lab7.builder;

public class Customer {
	private String firstname;
	private String lastname;
	private String phonenumber;
	
	public Customer(String firstname, String lastname, String phonenumber)
	{
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
	}
	
	public String getFirstName()
	{
		return this.firstname;
	}
	
	public void setFirstName(String firstname)
	{
		this.firstname = firstname;
	}
	
	
	public String getLastName()
	{
		return this.lastname;
	}
	
	public void setLastName(String lastname)
	{
		this.lastname = lastname;
	}
	
	public String getPhonenumber()
	{
		return this.phonenumber;
	}
}
