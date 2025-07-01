package practice;

public class Author 
{
	String name;
	int age;
	public void Authordetails()
	{
		System.out.println("Author Name :" +name);
		System.out.println("Author Age :" +age);
	}
	
	Author(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}
