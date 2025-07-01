package practice;

public class Book 
{
	String Title;
	int price;
	Address Adr;
	Author Aut;
	
	public void BookDetails()
	{
		System.out.println("Book Title :" +Title);
		System.out.println("Book Price :" +price);
	
	}
	
	public void CreateAddress(int dno,String cross,String distinct,String country)
	{
		Adr = new Address(dno,cross,distinct,country);
		
	}
	
	public void CreateAuthor(String name,int age)
	{
		Aut = new Author(name,age);
		
	}
	Book(String Title,int price)
	{
		this.Title = Title;
		this.price = price;
	}
}
