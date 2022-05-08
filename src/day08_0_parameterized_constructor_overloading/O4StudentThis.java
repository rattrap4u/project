package day08_0_parameterized_constructor_overloading;

public class O4StudentThis 
{

//this
//this is a reference variable and always refers to current class object and instance values.

//we have this constructor as well.------this() 
//this constructor can be parametrized also.----this(10);
//when we say  this() then it refers to current class default constructor.
//when we say  this(10) then it refers to current class parameterized constructor with one value.


	private int rollno;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	private String course;		//one more instance variable
	private String gender;      // newly added instance variable
	private O5Address add;  // reference variable which can't be static---------
	private static String org="C-DAC Hyderabad";  // class
// well-formed encapsulation - data is private.


	public O4StudentThis(int rollno, String name, int marks1, int marks2, int marks3)       // parametrized constructor name Student().
	{
		  // refers to default constructor
		this.rollno=rollno;
		this.name=name;   
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}

	public O4StudentThis(int rollno,String name,int marks1,int marks2,int marks3,String course,String gender,O5Address add)
	{
//this();  // here its not allowed. we can't write the default constructor more than one time.
		this(rollno, name, marks1, marks2, marks3);   // this refers to current class constructor any constructor that has int,String,int,int,int 
//which matches the argument passes previously.
		this.course=course;
		this.gender=gender;
		this.add=add;
	}
	public void disp()  //display method to display the student data
	{
		System.out.println("\nStudents Details : \n");
		System.out.println("Name :"+name+"\tRoll no. :"+rollno+"Course : "+course);
		System.out.println("Gender: "+gender+"\t"+marks1+"\t"+marks2+"\t"+marks3);
		System.out.println("Organization : "+org);
		add.dispAddress();   // this from address class 
	}
	void findAvg()
	{
		double avg=(marks1+marks2+marks3)/3;
		System.out.println("Average Marks : "+avg+"\n");
	}
	
}

