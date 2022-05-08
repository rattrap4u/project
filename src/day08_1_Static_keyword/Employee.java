package day08_1_Static_keyword;

public class Employee 
{
	private int eid;
	private String name;
	double basic;
	
		
	private static String org="C-DAC HYD";   // static or class variable
	private static String country;
	
	{
		// anything that is in open and closed braces is called block.
		// we can write certain block anywhere in our code.
		// scope of the variable declared inside that block will be only limited to the block only.
		// in java we can have static block 
		// purpose of the static block is to initialize static members
		
		// 
	}
	
	static {
		// its a static block.
		// it will be executed during the loading time only before the main method.
		System.out.println("This is static block!\n");
		country="India";
		org="MHA";
	}
	
	
	public Employee(int eid,String name,double basic)
	{
		this.eid=eid;
		this.name=name;
		this.basic=basic;
	}
	
	public static void changeOrg()   // static method
	{
		org="C-DAC";   // static org can be accessed here.
	}
	
	void getEmployee()
	{
		System.out.println(eid+" "+name+" "+basic+" "+org+" "+country);
	}
	
	public static void main(String[] args) 
	{
		Employee e1=new Employee(111,"ABC",82000);
		e1.getEmployee();
		
		changeOrg();  // calling static method  -- Employee.changeOrg()
		
		Employee e2=new Employee(112,"BCD",83000);
		e2.getEmployee();
		
		Employee e3=new Employee(113,"CDE",63000);
		System.out.println("Here MHA is change to C-DAC");
		e3.getEmployee();
	}
}
