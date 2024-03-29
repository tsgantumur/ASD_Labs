package lab6.CoR;

public class Address {
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	
	public Address(String street, String city, String state, String zipcode)
	{
		this.streetAddress = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String getStreetAddress()
	{
		return streetAddress;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public String getZipcode()
	{
		return zipcode;
	}
}
