package practice;

 class Driver 
 {

	public static void main(String[] args) 
	{
		
		//System.out.println("1.Upcast bet College n University access members");
		System.out.println("*******Upcasting*******");
		University u = new College();
		System.out.println("University Name:"+u.Uname);
		u.conductExternals();
		
		System.out.println("********DownCasting*********");
		
		College c = (College)u;
		System.out.println("University Name:"+c.Uname);
		System.out.println("College Name:"+c.CName);
		c.conductExternals();
		c.ConductInternals();
		
		//System.out.println("2.Upcast bet Department n College access members");
		
		System.out.println("*******Upcasting*******");
		
		College c1 = new Department();
		System.out.println("University Name:"+c1.Uname);
		System.out.println("College Name:"+c1.CName);
		c1.conductExternals();
		c1.ConductInternals();
		
		System.out.println("********DownCasting*********");
		
		Department d = (Department)c1;
		System.out.println("University Name"+d.Uname);
		System.out.println("College Name:"+d.CName);
		System.out.println("Department Name:"+d.dName);
	    d.conductExternals();
	    d.ConductInternals();
	    d.ConductPracticals();
	    
	    
        //System.out.println("2.Upcast bet Department n University access members");
		
		System.out.println("*******Upcasting*******");
		
		University u1 = new Department();
		System.out.println("University Name:"+u1.Uname);
		u1.conductExternals();
			
		System.out.println("********DownCasting*********");
		
		Department d1 = (Department)u1;
		System.out.println("University Name"+d1.Uname);
	    System.out.println("College Name:"+d1.CName);
		System.out.println("Department Name:"+d1.dName);
		d1.conductExternals();
		d1.ConductInternals();
		d1.ConductPracticals();

	}

}
