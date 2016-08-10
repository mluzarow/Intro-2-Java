/*
 *	Super-class for Unit 2 Exercise 9
 *
 *     DO NOT CHANGE!  
 *     DO NOT TURN IN!
 *
 */

public class Entry
{
	private String name;
	private String address;
	private String phone;
	
	public Entry()
	{
		name = "none";
		address = "none";
		phone = "none";
	}
	
	public Entry(String newName, String newAddress, String newPhone)
	{
		name = newName;
		address = newAddress;
		phone = newPhone;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void setAddress(String newAddress)
	{
		address = newAddress;
	}

	public void setPhone(String newPhone)
	{
		phone = newPhone;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}

	public String getPhone()
	{
		return phone;
	}
	
	public String toString()
	{
		return (name + " " + address + " " + phone);
	}
	public String toWrite()
	{
		return (name + "%" + address + "%" + phone);
	}
}
