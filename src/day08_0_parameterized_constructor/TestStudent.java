package day08_0_parameterized_constructor;

import day07_0_Object_oriented_programing_constructor.Students;

public class TestStudent 
{

	public static void main(String[] args) 
	{
		Students[] s=new Students[5];  // created an array of 5 students
		for(int i=0;i<s.length;i++)
		{
			s[i]=new Students();   // constructor - 5 times
			s[i].disp();   // to display the data as output
			s[i].findAvg();
	    }
		Student s3=new Student(123,"Tushar",89,78,86); // parameterized constructor
		s3.disp();
		s3.findAvg();
	}
}
