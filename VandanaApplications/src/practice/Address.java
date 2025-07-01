package practice;

public class Address
{
	int dno;
	String cross;
	String distinct;
	String country;
	public void address()
	{
		System.out.println("Door No:" +dno);
		System.out.println("Cross :" +cross);
		System.out.println("distinct:" +distinct);
		System.out.println("country:" +country);
		
	}
	//parameterised constructor
	Address(int dno,String cross,String distinct,String country)
	{
		this.dno = dno;
		this.cross = cross;
		this.distinct = distinct;
		this.country = country;
	}	

}
