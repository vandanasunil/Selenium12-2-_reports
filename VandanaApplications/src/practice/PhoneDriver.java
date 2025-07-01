package practice;

public class PhoneDriver {

	public static void main(String[] args)
	{
		Phone Ph = new Phone("Apple","white");
		System.out.println("Phone Brand:" +Ph.getBrand());
		System.out.println("Phone Color:" +Ph.getColor());
		System.out.println("Service Provider:" +Ph.sim.getServiceProvider());
		System.out.println("Contact No:" +Ph.sim.getConctactNO());
		
		System.out.println("********************************");
		Ph.SetBrand("One Plus");
		Ph.setColor("Black");
		Ph.sim.setServiceprovider("Airtel");
		Ph.sim.setContactNo(22445566);
		
		
		System.out.println("Phone Brand:" +Ph.getBrand());
		System.out.println("Phone Color:" +Ph.getColor());
		System.out.println("Service Provider:" +Ph.sim.getServiceProvider());
		System.out.println("Contact NO:" +Ph.sim.getConctactNO());
		
	}

}
