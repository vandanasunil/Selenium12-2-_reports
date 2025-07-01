package practice;

public class BookDriver 
{
	public static void main(String[] args)
	{
		// Book Details
		Book b = new Book("Java Programing",1000);
		//System.out.println(b.Title);
		//System.out.println(b.price);
		b.BookDetails();
		
		//Address Details
		b.CreateAddress(12,"5 Cross","Karnataka","India");
		System.out.println("************************");
		//System.out.println(b.Adr.dno);
		//System.out.println(b.Adr.cross);
		//System.out.println(b.Adr.distinct);
		//System.out.println(b.Adr.country);
		b.Adr.address();
		
		//Author Details.
		b.CreateAuthor("Balaguruswamy", 70);
		System.out.println("************************");
		//System.out.println(b.Aut.name);
		//System.out.println(b.Aut.age);
		b.Aut.Authordetails();
		
	}

}
