package com;

public class EmployeeDriver {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Aashrita",7,20000.0);
		Employee e2 = new Employee(1,"Mantra",5,2000.0);
		//Employee e3 = new Employee(1,"Aashrita",7,100000);
		//Employee e4 = new Employee(3,"Mantra",5,10000);
		//Employee e5 = new Employee(4,"Arahan",4,5000);
		System.out.println(e1.equals(e2));
		//System.out.println(e2.equals(e3));
		//System.out.println(e3.equals(e4));
		//System.out.println(e4.equals(e5));
		//System.out.println(e1.equals(e3));

	}

}
