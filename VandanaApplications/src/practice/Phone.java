package practice;

public class Phone 
{
	private String brand;
	private String Color;
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getColor()
	{
		return Color;
	}
	public void SetBrand(String brand)
	{
		this.brand = brand;
		
	}
	public void setColor(String Color)
	{
		this.Color = Color;
	}
	
	Simcard sim = new Simcard("BSNL",22445566);
	
	Phone(String brand,String Color)
	{
		this.brand= brand;
		this.Color= Color;
		
	}
	}


