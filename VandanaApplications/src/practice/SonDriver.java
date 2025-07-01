package practice;

 class SonDriver 
 {
	public static void main(String[] args) 
	{
		System.out.println("Main Start");
		System.out.println("-------Upcasting---------");
		Father f = new son();
		System.out.println("Father Age:" +f.age);
		f.walk();
		//System.out.println("Main End");
		System.out.println("----------Downcasting--------");
		son s = (son)f;
		System.out.println("Father Age:" +s.age);
		System.out.println("Son Name:"+s.name);
		s.walk();
		s.eat();
		System.out.println("Main End");
	}

}
