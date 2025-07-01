package practice;

public class Simcard
{
	private String Serviceprovider;
	private long ContactNo;
	
	public String getServiceProvider()
	{
		return Serviceprovider;		
	}
	
	public long getConctactNO()
	{
	  return ContactNo;	
	}
	
	public void setServiceprovider(String Serviceprovider)
	{
		this.Serviceprovider = Serviceprovider;
		
	}
	public void setContactNo(long ContactNo) 
	{
		this.ContactNo= ContactNo;
	}
	Simcard(String Serviceprovider,long ContactNo)
	{
		this.Serviceprovider = Serviceprovider;
		this.ContactNo = ContactNo;
		
	}
	}
	


