package day07_1_Object_oriented_programing;

public class O3_variables_1_example 
{
	//data members
	String name;  // instance/non-static -- heap area
	static String org="C-DAC hyd"; // class / static -- class area
	//method
	//setter or mutator method
	void setName(String n)  // n- local-stack area
	{
		name=n;
	}
	//getter or accessor method
	void getO3_variables_1_example()
	{
		System.out.println(name+"  "+org);
	}
	public static void main(String[] args) 
	{
		O3_variables_1_example x1,x2,x3;  // declaring rereferences
		x1=new O3_variables_1_example();
		x2=new O3_variables_1_example();
		x3=new O3_variables_1_example();
		x1.setName("PG_DAC  ");
		x2.setName("PG-DASSD");
		x3.setName("PG-DESD ");
		
		x1.getO3_variables_1_example();
		x2.getO3_variables_1_example();
		x3.getO3_variables_1_example();
	}

}
