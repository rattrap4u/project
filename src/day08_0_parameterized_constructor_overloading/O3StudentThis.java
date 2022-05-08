//					this
// this is a reference variable and always refers to current class object and instance values.

// we have this constructor as well.------this() 
// this constructor can be parametrized also.----this(10);
// when we say  this() then it refers to current class default constructor.
// when we say  this(10) then it refers to current class parameterized constructor with one value.

package day08_0_parameterized_constructor_overloading;

public class O3StudentThis 
{

	private int rollno;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	private String course;		//one more instance variable
	private String gender;      // newly added instance variable
	private static String org="C-DAC Hyderabad";  // class
	// well-formed encapsulation - data is private.
	
	public O3StudentThis()
	{
		System.out.println("I'm a default constructor!!");
	}
	
	public O3StudentThis(int rollno, String name, int marks1, int marks2, int marks3)       // parametrized constructor name Student().
	{
		this();   // refers to default constructor
		this.rollno=rollno;
		this.name=name;   
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	public O3StudentThis(int rollno,String name,int marks1,int marks2,int marks3,String course,String gender)
	{
//		this();  // here its not allowed. we can't write the default constructor more than one time.
		this(rollno, name, marks1, marks2, marks3);   // this refers to current class constructor any constructor that has int,String,int,int,int 
		//which matches the argument passes previously.
		this.course=course;
		this.gender=gender;
	}
	public void disp()  //display method to display the student data
	{
		System.out.println("Students Details : ");
		System.out.println("Name :"+name+"\tRoll no. :"+rollno+"Course : "+course);
		System.out.println("Gender: "+gender+"\t"+marks1+"\t"+marks2+"\t"+marks3);
		System.out.println("Organization : "+org);
	}
	void findAvg()
	{
		double avg=(marks1+marks2+marks3)/3;
		System.out.println("Average Marks : "+avg+"\n");
	}
	public static void main(String[] args)
	{
		O3StudentThis s1=new O3StudentThis(123,"tushar",89,88,78);    // old object
		s1.disp();
		s1.findAvg();
		
		O3StudentThis s2=new O3StudentThis(111,"rahul",98,89,90,"DAC","Male");
		s2.disp();
		s2.findAvg();
	}
}
