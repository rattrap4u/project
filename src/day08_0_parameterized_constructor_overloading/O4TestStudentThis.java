package day08_0_parameterized_constructor_overloading;

public class O4TestStudentThis 
{

	public static void main(String[] args) 
	{
		
		O5Address a1=new O5Address("114","Dream Valley Road","MNK","Hyd","TS","INDIA",500005);
		O4StudentThis s1=new O4StudentThis(111,"rahul",98,89,90,"DAC","Male",a1);
		s1.disp();
		s1.findAvg();
		
		O5Address a2=new O5Address("115","M G Road","MNK","Hyd","TS","INDIA",500006);
		O4StudentThis s2=new O4StudentThis(111,"Shreya",98,89,90,"DAC","Female",a2);
		s2.disp();
		s2.findAvg();
	}

}
