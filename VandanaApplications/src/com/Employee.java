package com;

public class Employee 
{
	int id;
	String Name;
	int age;
	double salary;
	Employee(int id,String Name,int age,double salary)
	{
	this.id = id;
	this.Name = Name;
	this.age = age;
	this.salary = salary;	
	}
	
	public boolean equals(object o)
	{
		Employee e =(Employee)o;
		if((id==e.id))
				//&&(this.Name.equals(e.Name)&&(this.age==e.age)
				//&&(this.salary==e.salary)))
		{
			return true;
			
		}
		else
		{
			return false;
	
		}
	}
	
	
}
