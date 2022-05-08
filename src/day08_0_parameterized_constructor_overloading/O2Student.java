package day08_0_parameterized_constructor_overloading;

public class O2Student 
{

	private int rollno;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	private static String org="C-DAC Hyderabad";  // class
	// well-formed encapsulation - data is private.
	
	public O2Student(int rollno, String name, int marks1, int marks2, int marks3)       // parametrized constructor name Student().
	{
		rollno=rollno;
		name=name;   
		marks1=marks1;
		marks2=marks2;
		marks3=marks3;
	}
	
	public void disp()  //display method to display the student data
	{
		System.out.println("Students Details : ");
		System.out.println("Name :"+name+"\tRoll no. :"+rollno);
		System.out.println(marks1+"\t"+marks2+"\t"+marks3);
		System.out.println("Organization : "+org);
	}
	void findAvg()
	{
		double avg=(marks1+marks2+marks3)/3;
		System.out.println("Average Marks : "+avg+"\n");
	}
	public static void main(String[] args)
	{
		O2Student s1=new O2Student(123,"tushar",89,88,78);    //parameterized
		s1.disp();
		s1.findAvg();
	}
}


// The output will be default value of the datatypes.
// because i have made my local variable same as instance variables
//  and in my constructor i am assigning same name as instance variables. that's why  we are getting default values.
// as local have the highest priority-- called priciple of locality preference