package practice;

public class EmployeeDriver
{

	public static void main(String[] args) 
	{
		Employee E1 = new Employee(1,"A",1000,"Female");
		Employee E2 = new Employee(7,"B",1100,"Female");
		Employee E3 = new Employee(15,"C",1200,"Female");
		Employee E4 = new Employee(2,"D",1030,"Female");
		Employee E5 = new Employee(3,"A",1000,"Female");
		
		Employee[] EmpArr = new Employee[5];
		EmpArr[0]= E1;
		EmpArr[1]= E2;
		EmpArr[2]= E3;
		EmpArr[3]= E4;
		EmpArr[4]= E5;
		
		for(Employee e : EmpArr)
		{
	        if(e.id==7 || e.id==15)
			{
	        	System.out.println("******************");
				System.out.println("EmpiD:" +e.id);
				System.out.println("EmpName:" +e.Name);
				System.out.println("EmpSalary:" +e.salary);
				System.out.println("Gender:" +e.Gen);		
				
			}
		}
    }	}


